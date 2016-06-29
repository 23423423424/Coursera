package Week1

object sheet2 {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / 2 < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  }                                               //> sqrt: (x: Double)Double

	val x = 0                                 //> x  : Int = 0
	def f(y: Int) = y + 1                     //> f: (y: Int)Int
	val result = {
		val x = f(3)
		x * x
	} + x                                     //> result  : Int = 16
	
	
	
	
	

}