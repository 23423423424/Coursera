package recfun

object Pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(275); 
	//0,2 = 1 1,2 = 2 1,2 = 2
	//return 1 if the value is on the edge of the triangle
	//else return the two numbers above the location
	def pascal(c: Int, r: Int): Int =
		if (c == 0) 1
		else if(c == r) 1
		else pascal(c-1, r-1) + pascal(c,r-1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(15); val res$0 = 
	
	pascal(0,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
	pascal(1,2);System.out.println("""res1: Int = """ + $show(res$1))}
	
}
