package week5

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
	var xs = List(1,2,3);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(22); 
	var ys = List(4,5,6);System.out.println("""ys  : List[Int] = """ + $show(ys ));$skip(13); 
	println(xs);$skip(20); 
	println(xs.length);$skip(18); 
	println(xs.last);$skip(18); 
	println(xs.init);$skip(20); 
	println(xs take 2);$skip(20); 
	println(xs drop 2);$skip(16); 
	println(xs(1));$skip(21); 
	var temp = xs ++ ys;System.out.println("""temp  : List[Int] = """ + $show(temp ));$skip(15); 
	println(temp);$skip(21); 
	println(xs.reverse);$skip(27); 
	println(xs updated (0,1));$skip(23); 
	println(xs indexOf 1);$skip(24); 
	println(xs contains 1)}
	
	
	
	
	
	
	
	
	
	
	
	
}
