package week4

object functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
	val f = (x: Int) => x * x;System.out.println("""f  : Int => Int = """ + $show(f ));$skip(6); val res$0 = 
	f(7);System.out.println("""res0: Int = """ + $show(res$0));$skip(65); 
	val f1 = new Function[Int, Int]{
		def apply(x: Int) = x * x
	};System.out.println("""f1  : Function[Int,Int] = """ + $show(f1 ));$skip(12); val res$1 = 
	f.apply(7);System.out.println("""res1: Int = """ + $show(res$1))}
}
