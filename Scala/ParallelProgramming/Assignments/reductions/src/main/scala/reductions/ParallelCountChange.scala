package reductions

import org.scalameter._
import common._

object ParallelCountChangeRunner {

  @volatile var seqResult = 0

  @volatile var parResult = 0

  val standardConfig = config(
    Key.exec.minWarmupRuns -> 20,
    Key.exec.maxWarmupRuns -> 40,
    Key.exec.benchRuns -> 80,
    Key.verbose -> true) withWarmer (new Warmer.Default)

  def main(args: Array[String]): Unit = {
    val amount = 250
    val coins = List(1, 2, 5, 10, 20, 50)
    val seqtime = standardConfig measure {
      seqResult = ParallelCountChange.countChange(amount, coins)
    }
    println(s"sequential result = $seqResult")
    println(s"sequential count time: $seqtime ms")

    def measureParallelCountChange(threshold: ParallelCountChange.Threshold): Unit = {
      val fjtime = standardConfig measure {
        parResult = ParallelCountChange.parCountChange(amount, coins, threshold)
      }
      println(s"parallel result = $parResult")
      println(s"parallel count time: $fjtime ms")
      println(s"speedup: ${seqtime / fjtime}")
    }

    measureParallelCountChange(ParallelCountChange.moneyThreshold(amount))
    measureParallelCountChange(ParallelCountChange.totalCoinsThreshold(coins.length))
    measureParallelCountChange(ParallelCountChange.combinedThreshold(amount, coins))
  }
}

object ParallelCountChange {

  /**
   * Returns the number of ways change can be made from the specified list of
   *  coins for the specified amount of money.
   */

  def countChange(money: Int, coins: List[Int]): Int = money match {
    case x if x < 0  => 0
    case x if x == 0 => 1
    case _ => coins match {
      case xs if xs.isEmpty => 0
      case xs :: xz         => countChange(money - xs, coins) + countChange(money, xz)
    }
  }

  type Threshold = (Int, List[Int]) => Boolean

  /**
   * In parallel, counts the number of ways change can be made from the
   *  specified list of coins for the specified amount of money.
   */
  def parCountChange(money: Int, coins: List[Int], threshold: Threshold): Int = {
    if (threshold(money, coins)) {
      countChange(money, coins)
    } else {
      money match {
        case x if x < 0  => 0
        case x if x == 0 => 1
        case _ => coins match {
          case xs if xs.isEmpty => 0
          case xs :: xz =>
            val (x, y) = parallel(parCountChange(money - xs, coins, threshold), parCountChange(money, xz, threshold))
            x + y
        }
      }
    }
  }

  /** Threshold heuristic based on the starting money. */
  def moneyThreshold(startingMoney: Int): Threshold = {
    (remaining, coins) =>
      {
        remaining <= startingMoney * 2 / 3
      }
  }
  /** Threshold heuristic based on the total number of initial coins. */
  def totalCoinsThreshold(totalCoins: Int): Threshold = {
    (remaining, coins) =>
      {
        coins.size <= totalCoins * 2 / 3
      }
  }
  /** Threshold heuristic based on the starting money and the initial list of coins. */
  def combinedThreshold(startingMoney: Int, allCoins: List[Int]): Threshold = {
    (remaining, coins) =>
      {
        remaining * coins.size <= startingMoney * allCoins.size / 2
      }
  }
}
