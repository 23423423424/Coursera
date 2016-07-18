package week5

object last {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(176); 
	def last1[T](xs: List[T]): T = xs match{
		case List() => throw new Error("last of empty list")
		case List(x) => x
		case y :: ys => last1(ys)
	};System.out.println("""last1: [T](xs: List[T])T""");$skip(29); 
	println(last1(List(1,2,3)))}
}
