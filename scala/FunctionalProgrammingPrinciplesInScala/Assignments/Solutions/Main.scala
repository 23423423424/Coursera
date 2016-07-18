package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def value(chars: List[Char], sum: Int): Boolean = {
      if (chars.isEmpty) sum == 0
      else {
        val head = chars.head
        val temp =
          if (head == '(') sum + 1
          else if (head == ')') sum - 1
          else sum
        if (sum >= 0) value(chars.tail, temp)
        else false
      }
    }
    value(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(target: Int, coin: List[Int]): Int = {
      if (coin.isEmpty) 0
      else if (money - coin.head == 0) 1
      else if (money - coin.head < 0) 0
      else countChange(money - coin.head, coin) + countChange(money, coin.tail)
    }
    count(money, coins.sorted)
  }
}
