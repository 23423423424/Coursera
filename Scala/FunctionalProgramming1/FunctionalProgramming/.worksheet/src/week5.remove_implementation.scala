package week5

object remove_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
	def removeAt(xs: List[Int], n: Int) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt: (xs: List[Int], n: Int)List[Int]""");$skip(38); 
	println( removeAt( List(1,2,3),1 ) )}
}
