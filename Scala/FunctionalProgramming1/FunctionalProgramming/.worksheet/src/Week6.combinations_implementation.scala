package Week6

object combinations_implementation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
	val x = List(1,2,3);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(21); 
	val y = List(4,5,6);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(58); 
	var z = (1 to 3) flatMap(x => (1 to 2) map (y => (x,y)));System.out.println("""z  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(z ));$skip(12); 
	println(z)}
}
