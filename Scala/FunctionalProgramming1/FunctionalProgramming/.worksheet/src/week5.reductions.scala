package week5

object reductions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
	val x = List(1,2,3,4);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(91); 
	def sum(xs: List[Int]): Int = xs match {
		case Nil => 0
		case y :: ys => y + sum(ys)
	};System.out.println("""sum: (xs: List[Int])Int""");$skip(8); val res$0 = 
	sum(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(83); 
	
	// reduceLeft
	
	def sum2(xs: List[Int]) = (0 :: xs) reduceLeft((x,y) => x + y);System.out.println("""sum2: (xs: List[Int])Int""");$skip(9); val res$1 = 
	sum2(x);System.out.println("""res1: Int = """ + $show(res$1));$skip(67); 
	
	def product(xs: List[Int]) = (1 :: xs) reduceLeft((x,y) => x*y);System.out.println("""product: (xs: List[Int])Int""");$skip(12); val res$2 = 
	product(x);System.out.println("""res2: Int = """ + $show(res$2));$skip(61); 
	
	def product2(xs: List[Int]) = (1 :: xs) reduceLeft(_ * _);System.out.println("""product2: (xs: List[Int])Int""");$skip(13); val res$3 = 
	product2(x);System.out.println("""res3: Int = """ + $show(res$3))}
	
	
	
	
	
	
	
	
	
	
}
