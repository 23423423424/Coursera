package week5

object reverse_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 
	def reverse[T](xs: List[T]): List[T] = xs match {
		case List() => xs
		case y :: ys => reverse(ys) ++ List(y)
	};System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(22); val res$0 = 
	reverse(List(1,2,3));System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
