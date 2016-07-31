package reductions

object arrayTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
	val x = Array(1,2,3,4);System.out.println("""x  : Array[Int] = """ + $show(x ));$skip(17); 
	println(x.head);$skip(17); 
	println(x.tail);$skip(10); val res$0 = 
	x.toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(11); val res$1 = 
	x.isEmpty;System.out.println("""res1: Boolean = """ + $show(res$1))}
	
	
}
