package week1_ComputationsInParallel

object nameTesting {
	// this passes the computations of the expressions the values themselves
  def sum(x: => Int, y: => Int): Int = {
    val xs = (x + y)
    xs
  }                                               //> sum: (x: => Int, y: => Int)Int
  // this is passing the values of the function
  def sum1(x: Int, y: Int): Int = {
    val xs = (x + y)
    xs
  }                                               //> sum1: (x: Int, y: Int)Int
  sum(1, 2)                                       //> res0: Int = 3
  sum1(1,2)                                       //> res1: Int = 3
}