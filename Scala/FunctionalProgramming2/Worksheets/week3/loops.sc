package week3

object loops {
  def power(x: Double, exp: Int): Double = {
    var r = 1.0
    var i = exp
    while (i > 0) {
      r = r * x;
      i = i - 1
    }
    r
  }                                               //> power: (x: Double, exp: Int)Double
  power(2,3)                                      //> res0: Double = 8.0
}