package Week1
import scala.annotation.tailrec

object sheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(331); 
  //tail recursive are iterative processes
  //the last action of a function consists of calling a function the stack frame can be reused

  //@tailrec //requires that the function be tail recursive
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(15); val res$0 = 

  gcd(14, 21);System.out.println("""res0: Int = """ + $show(res$0));$skip(99); 
	
	//not tail recursive
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(16); val res$1 = 

  factorial(4);System.out.println("""res1: Int = """ + $show(res$1))}

}
