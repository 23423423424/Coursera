package reductions

object caseTesting {

  var y = List(1, 1, 2)                           //> y  : List[Int] = List(1, 1, 2)
  def casetest(x: List[Int]): Int = x.head match {
    case x if x == 2 => 1
    case x if x == 1 => 2
  }                                               //> casetest: (x: List[Int])Int
  
  casetest(y)                                     //> res0: Int = 2
  

}