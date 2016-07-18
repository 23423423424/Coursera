package week5

object scale_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(194); 
	def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
		case Nil => xs
		case y :: ys => y * factor :: scaleList(ys, factor)
	};System.out.println("""scaleList: (xs: List[Double], factor: Double)List[Double]""");$skip(25); 
	val x = List(1.0,2,3,4);System.out.println("""x  : List[Double] = """ + $show(x ));$skip(28); 
	val x_int = List(-1,2,3,4);System.out.println("""x_int  : List[Int] = """ + $show(x_int ));$skip(25); 
	println(scaleList(x,2));$skip(79); 
	def scaleList2(xs: List[Double], factor: Double) =
		xs map (x => x * factor);System.out.println("""scaleList2: (xs: List[Double], factor: Double)List[Double]""");$skip(26); 
	println(scaleList2(x,2));$skip(115); 
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case x :: xs => x*x :: squareList(xs)
	};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(65); 
	def squareList2(xs: List[Int]): List[Int] =
		xs map (x => x*x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(29); 
	println(squareList2(x_int));$skip(194); 
	// selecting all elements satisfying a given condition
	def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
	};System.out.println("""posElems: (xs: List[Int])List[Int]""");$skip(26); 
	println(posElems(x_int));$skip(139); 
	// posElems can be generalized to a method using the filter the class
	def posElems1(xs: List[Int]): List[Int] =
		xs filter (x => x > 0);System.out.println("""posElems1: (xs: List[Int])List[Int]""");$skip(27); 
	println(posElems1(x_int))}
	
	
	
}
