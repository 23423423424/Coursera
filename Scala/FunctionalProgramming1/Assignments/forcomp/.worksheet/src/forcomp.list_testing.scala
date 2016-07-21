package forcomp

object list_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
	val x = (1,2) :: Nil;System.out.println("""x  : List[(Int, Int)] = """ + $show(x ));$skip(19); 
	println(x.toList);$skip(67); 
	val y = (for {
		i <- 0 to 1
		j <- 0 to 1
	}	yield (i,j)).toList;System.out.println("""y  : List[(Int, Int)] = """ + $show(y ));$skip(12); 
	println(y)}
}
