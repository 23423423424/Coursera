package Week1
import scala.annotation.tailrec

object sheet3 {
  //tail recursive are iterative processes
  //the last action of a function consists of calling a function the stack frame can be reused

  //@tailrec //requires that the function be tail recursive
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)              //> gcd: (a: Int, b: Int)Int

  gcd(14, 21)                                     //> res0: Int = 7
	
	//not tail recursive
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)       //> factorial: (n: Int)Int

  factorial(4)                                    //> res1: Int = 24

}