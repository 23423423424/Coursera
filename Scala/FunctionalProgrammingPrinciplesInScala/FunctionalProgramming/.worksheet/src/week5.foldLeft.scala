package week5

object foldLeft {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
	val x = List(1,2,3,4);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(48); 
	def sum(xs: List[Int]) = (xs foldLeft 0) (_+_);System.out.println("""sum: (xs: List[Int])Int""");$skip(8); val res$0 = 
	sum(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); 
	def product(xs: List[Int]) = (xs foldLeft 1) (_*_);System.out.println("""product: (xs: List[Int])Int""");$skip(12); val res$1 = 
	product(x);System.out.println("""res1: Int = """ + $show(res$1))}
}
