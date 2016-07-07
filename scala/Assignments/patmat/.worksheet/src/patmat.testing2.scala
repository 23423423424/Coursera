package patmat

object testing2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

	var x = 1 :: 2 :: Nil;System.out.println("""x  : List[Int] = """ + $show(x ));$skip(23); 
	var y = 3 :: 4 :: Nil;System.out.println("""y  : List[Int] = """ + $show(y ));$skip(17); 
	var z = x ::: y;System.out.println("""z  : List[Int] = """ + $show(z ));$skip(24); 
	var x1 = List(1,2,3,4);System.out.println("""x1  : List[Int] = """ + $show(x1 ));$skip(21); 
var x2 = List(5,6,7);System.out.println("""x2  : List[Int] = """ + $show(x2 ));$skip(37); 

	println(List(x1,x2).flatMap(x=>x))}

}
