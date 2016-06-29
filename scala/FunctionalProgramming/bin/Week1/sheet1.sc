package Week1

object sheet1 {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / 2 < 0.001            //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  Math.sqrt(2)                                    //> res0: Double = 1.4142135623730951
  Math.sqrt(4)                                    //> res1: Double = 2.0
  sqrtIter(2.0,2.0)                               //> res2: Double = 1.4142156862745097

}