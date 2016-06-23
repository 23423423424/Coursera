package recfun

object change {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(373); 

	def countChange(money: Int, coins: List[Int]): Int = {
    def count(target: Int, coin: List[Int]): Int = {
      if (coin.isEmpty) 0
      else if (money - coins.head == 0) 1
      else if (money - coins.head < 0) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
    count(money,coins.sorted)
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""")}

}
