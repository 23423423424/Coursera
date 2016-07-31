package reductions

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(375); 

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(target: Int, coin: List[Int]): Int = {
      if (coin.isEmpty) 0
      else if (money - coin.head == 0) 1
      else if (money - coin.head < 0) 0
      else countChange(money - coin.head, coin) + countChange(money, coin.tail)
    }
    count(money, coins.sorted)
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(405); 
   def countChangeParallel(money: Int, coins: List[Int]): Int = {
    def count(target: Int, coin: List[Int]): Int = {
    	if(target < threshold){
    		//seq
    	}
      if (coin.isEmpty) 0
      else if (money - coin.head == 0) 1
      else if (money - coin.head < 0) 0
      else par(countChange(money - coin.head, coin)) + par(countChange(money, coin.tail))
    }
    count(money, coins.sorted)
  };System.out.println("""countChangeParallel: (money: Int, coins: List[Int])Int""");$skip(26); 

  var coins = List(1, 2);System.out.println("""coins  : List[Int] = """ + $show(coins ));$skip(16); 
  var money = 4;System.out.println("""money  : Int = """ + $show(money ));$skip(24); val res$0 = 
  countChange(4, coins);System.out.println("""res0: Int = """ + $show(res$0))}
  
}
