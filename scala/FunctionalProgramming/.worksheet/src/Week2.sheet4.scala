package Week2

object sheet4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 
	val tolerance = .0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(50); 
	def abs(x: Double) =
		if(x < 0) x * -1
		else x;System.out.println("""abs: (x: Double)Double""");$skip(59); 
	def abs1(x: Double): Double =
		if(x < 0) x * -1
		else x;System.out.println("""abs1: (x: Double)Double""");$skip(9); val res$0 = 
	abs(-2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
	abs1(-2);System.out.println("""res1: Double = """ + $show(res$1));$skip(76); 
	
	def isCloseEnough(x: Double, y: Double) =
		abs((x-y)/x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(249); 
		
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			println("guess = " + guess)
			val next = f(guess)
			if (isCloseEnough(guess,next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(29); val res$2 = 
	fixedPoint(x => 1 + x/2)(1);System.out.println("""res2: Double = """ + $show(res$2));$skip(63); 
	
	def sqrt(x: Double) =
		fixedPoint(y => (y + x / y)/2)(1.0);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$3 = 
	sqrt(2);System.out.println("""res3: Double = """ + $show(res$3));$skip(66); 
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(65); 
  def sqrt1(x: Double) =
  	fixedPoint(averageDamp(y => x/y))(1);System.out.println("""sqrt1: (x: Double)Double""");$skip(10); val res$4 = 
	sqrt1(2);System.out.println("""res4: Double = """ + $show(res$4))}
 	
                                                  
}
