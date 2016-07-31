package reductions

object testing {

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(target: Int, coin: List[Int]): Int = {
      if (coin.isEmpty) 0
      else if (money - coin.head == 0) 1
      else if (money - coin.head < 0) 0
      else countChange(money - coin.head, coin) + countChange(money, coin.tail)
    }
    count(money, coins.sorted)
  }
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
  }

  var coins = List(1, 2)
  var money = 4
  countChange(4, coins)
  
}