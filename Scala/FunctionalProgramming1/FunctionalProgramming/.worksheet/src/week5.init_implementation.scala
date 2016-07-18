package week5

object init_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(206); 
	def init[T](xs: List[T]): List[T] = xs match {
		case List() => throw new Error("init of empty list")
		case List(x) => List()
		case x :: xs => x :: init(xs)
	};System.out.println("""init: [T](xs: List[T])List[T]""");$skip(28); 
	println(init(List(1,2,3)))}
}
