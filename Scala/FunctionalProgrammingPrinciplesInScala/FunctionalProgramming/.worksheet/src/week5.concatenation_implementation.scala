package week5

object concatenation_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(176); 

	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
		case List() => ys
		case z :: zs => z :: concat(zs,ys)
	};System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(42); 
	println(concat(List(1,2,3),List(4,5,6)))}
	
}
