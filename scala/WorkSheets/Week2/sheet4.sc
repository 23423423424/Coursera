package Week2

object sheet4 {
	val tolerance = .0001                     //> tolerance  : Double = 1.0E-4
	def abs(x: Double) =
		if(x < 0) x * -1
		else x                            //> abs: (x: Double)Double
	def abs1(x: Double): Double =
		if(x < 0) x * -1
		else x                            //> abs1: (x: Double)Double
	abs(-2)                                   //> res0: Double = 2.0
	abs1(-2)                                  //> res1: Double = 2.0
	
	def isCloseEnough(x: Double, y: Double) =
		abs((x-y)/x) / x < tolerance      //> isCloseEnough: (x: Double, y: Double)Boolean
		
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			println("guess = " + guess)
			val next = f(guess)
			if (isCloseEnough(guess,next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	fixedPoint(x => 1 + x/2)(1)               //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.75
                                                  //| guess = 1.875
                                                  //| guess = 1.9375
                                                  //| guess = 1.96875
                                                  //| guess = 1.984375
                                                  //| guess = 1.9921875
                                                  //| guess = 1.99609375
                                                  //| guess = 1.998046875
                                                  //| guess = 1.9990234375
                                                  //| guess = 1.99951171875
                                                  //| res2: Double = 1.999755859375
	
	def sqrt(x: Double) =
		fixedPoint(y => (y + x / y)/2)(1.0)
                                                  //> sqrt: (x: Double)Double
	sqrt(2)                                   //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.4166666666666665
                                                  //| guess = 1.4142156862745097
                                                  //| res3: Double = 1.4142135623746899
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  def sqrt1(x: Double) =
  	fixedPoint(averageDamp(y => x/y))(1)      //> sqrt1: (x: Double)Double
	sqrt1(2)                                  //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.4166666666666665
                                                  //| guess = 1.4142156862745097
                                                  //| res4: Double = 1.4142135623746899
 	
                                                  
}