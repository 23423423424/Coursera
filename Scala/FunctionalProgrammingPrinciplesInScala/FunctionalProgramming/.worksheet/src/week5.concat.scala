package week5

object concat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
	def factorial(n: Int): Int =
		if (n==0) 1
		else n * factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(127); 
	
	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match{
		case List() => ys
		case x :: xs1 => x :: concat(xs1, ys)
	};System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""")}
	
}
