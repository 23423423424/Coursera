package Week6

object other_collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
	val nums = Vector(1, 2, 3, -48);System.out.println("""nums  : scala.collection.immutable.Vector[Int] = """ + $show(nums ));$skip(51); 
	val people = Vector("Bob", "Jack", "John","Ryan");System.out.println("""people  : scala.collection.immutable.Vector[String] = """ + $show(people ));$skip(26); 
 	println(nums +: people);$skip(25); 
	println(nums :+ people);$skip(28); 
	
	val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(21); val res$0 = 
	xs map (x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(25); 
	
	val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(27); val res$1 = 
	s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(28); 
	
	val r: Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(24); 
	val s1: Range = 1 to 5;System.out.println("""s1  : Range = """ + $show(s1 ));$skip(14); val res$2 = 
	1 to 10 by 3;System.out.println("""res2: scala.collection.immutable.Range = """ + $show(res$2));$skip(14); val res$3 = 
	6 to 1 by -2;System.out.println("""res3: scala.collection.immutable.Range = """ + $show(res$3))}
	
	
	
	
	
	
	
}
