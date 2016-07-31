package barneshut

object foldTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
	val x = Seq(1,2,3);System.out.println("""x  : Seq[Int] = """ + $show(x ));$skip(31); val res$0 = 
	x.foldLeft(0)((x,y) => x + y);System.out.println("""res0: Int = """ + $show(res$0))}
	
}
