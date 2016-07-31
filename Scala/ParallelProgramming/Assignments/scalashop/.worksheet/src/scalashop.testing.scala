package scalashop

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
	val x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(14); 
	val end = 10;System.out.println("""end  : Int = """ + $show(end ));$skip(11); 
	val y = 4;System.out.println("""y  : Int = """ + $show(y ));$skip(34); 
	val xs = Math.ceil(x/y.toDouble);System.out.println("""xs  : Double = """ + $show(xs ));$skip(59); 
	var start = (for{
		i <- 0 until x by 4
	}yield i).toList;System.out.println("""start  : List[Int] = """ + $show(start ));$skip(16); 
	println(start);$skip(53); 

	var zipped = start.map(x => (x,Math.min(x+4,end)));System.out.println("""zipped  : List[(Int, Int)] = """ + $show(zipped ))}
	
	
	
	
	
}
