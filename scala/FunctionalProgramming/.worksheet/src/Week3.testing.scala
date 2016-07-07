package Week3

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
	
	val f: Function1[Int,String] = myInt => "my int: " + myInt.toString;System.out.println("""f  : Int => String = """ + $show(f ));$skip(6); val res$0 = 
	f(4);System.out.println("""res0: String = """ + $show(res$0));$skip(34); 
	
	val g = () => println("Hello");System.out.println("""g  : () => Unit = """ + $show(g ));$skip(7); 
	
	g();$skip(60); 
	
	def h(myInt:Int): String =
	 myInt.toString + " my int.";System.out.println("""h: (myInt: Int)String""")}

}
