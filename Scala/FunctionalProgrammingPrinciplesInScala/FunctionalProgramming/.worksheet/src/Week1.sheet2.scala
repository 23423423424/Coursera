package Week1

object sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(311); 

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / 2 < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); 

	val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(23); 
	def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(46); 
	val result = {
		val x = f(3)
		x * x
	} + x;System.out.println("""result  : Int = """ + $show(result ))}
	
	
	
	
	

}
