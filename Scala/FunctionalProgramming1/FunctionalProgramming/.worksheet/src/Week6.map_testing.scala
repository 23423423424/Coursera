package Week6

object map_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
	var x = Map(1 -> 2, 2 -> 3);System.out.println("""x  : scala.collection.immutable.Map[Int,Int] = """ + $show(x ));$skip(12); 
	println(x);$skip(6); val res$0 = 
	x(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(29); 
 	x = x + (1 -> (x(1) + 1) );$skip(13); 
 	println(x)}
	
}
