package reductions

object testing_tuple {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
	def tuple() = (1,2);System.out.println("""tuple: ()(Int, Int)""");$skip(17); 
	val x = tuple();System.out.println("""x  : (Int, Int) = """ + $show(x ));$skip(21); 
	val (y,z) = tuple();System.out.println("""y  : Int = """ + $show(y ));System.out.println("""z  : Int = """ + $show(z ));$skip(13); val res$0 = 
 	x == (y,z);System.out.println("""res0: Boolean = """ + $show(res$0))}
 	
}
