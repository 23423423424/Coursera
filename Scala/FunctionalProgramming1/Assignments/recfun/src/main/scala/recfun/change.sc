package recfun

object change {

 def countChange(money: Int, coins: List[Int]): Int = money match {
    case x if x < 0  => 0
    case x if x == 0 => 1
    case _ => coins match {
      case xs if xs.isEmpty => 0
      case xs :: xz         => countChange(money - xs, coins) + countChange(money, xz)
    }
  }                                          //> countChange: (money: Int, coins: List[Int])Int

}
