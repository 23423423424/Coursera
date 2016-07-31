package barneshut

object sequenceTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
	val x = Seq(1,2,3);System.out.println("""x  : Seq[Int] = """ + $show(x ));$skip(12); 
	println(x);$skip(21); 
	val y = List(1,2,3);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(8); val res$0 = 
	x == y;System.out.println("""res0: Boolean = """ + $show(res$0))}
	
}
