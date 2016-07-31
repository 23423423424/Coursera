package reductions

object sliceTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
	val x = Array(1,2,3,4);System.out.println("""x  : Array[Int] = """ + $show(x ));$skip(22); 
	val y = x.slice(0,2);System.out.println("""y  : Array[Int] = """ + $show(y ));$skip(23); val res$0 = 
	y.zip(0 until 5 by 2);System.out.println("""res0: Array[(Int, Int)] = """ + $show(res$0));$skip(7); val res$1 = 
	2 / 0;System.out.println("""res1: Int = """ + $show(res$1))}
	
}
