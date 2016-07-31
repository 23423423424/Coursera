package barneshut

object concattesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
	val x = List(1,2,3);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(21); 
	val y = List(4,5,6);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(8); val res$0 = 
	x :: y;System.out.println("""res0: List[Any] = """ + $show(res$0));$skip(8); val res$1 = 
	x +: y;System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(35); 
	val z = Array(Array(1,2,3),4,5,6);System.out.println("""z  : Array[Any] = """ + $show(z ));$skip(8); val res$2 = 
	z :: x;System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(8); val res$3 = 
	z +: x;System.out.println("""res3: List[Any] = """ + $show(res$3));$skip(57); 
	
	def run(x: Int) = x match {
		case z@x =>
			z + 1
	};System.out.println("""run: (x: Int)Int""");$skip(8); val res$4 = 
	run(2);System.out.println("""res4: Int = """ + $show(res$4))}
	
}
