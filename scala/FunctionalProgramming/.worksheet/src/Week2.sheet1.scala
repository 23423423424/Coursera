package Week2

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(17); val res$0 = 

  sumInts(2, 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(37); 

  def cube(x: Int): Int = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(94); 

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0
    else cube(a) + sumCubes(a + 1, b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(190); 

  /*
	def sumFact(a: Int, b: Int): Int =
		if(a>b) 0
		else fact(a) + sumFact(a+1,b)
		*/

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""")}
    

}
