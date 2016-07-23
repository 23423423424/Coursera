package streams

object testingFlatten {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
	val x = List(List(1,2,3),List(4,5,6)).flatten;System.out.println("""x  : List[Int] = """ + $show(x ));$skip(12); 
	println(x);$skip(21); 
	val y = List(3,2,1);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(10); val res$0 = 
	y.sorted;System.out.println("""res0: List[Int] = """ + $show(res$0))}
	
}
