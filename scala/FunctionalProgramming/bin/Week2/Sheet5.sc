package Week2

object Sheet5 {
  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)                          //> addRational: (r: Week2.Rational, s: Week2.Rational)Week2.Rational

  def makeString(r: Rational) =
    r.numer + "/" + r.denom                       //> makeString: (r: Week2.Rational)String

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res0: String = 7/6

  val x = new Rational(1, 2)                      //> x  : Week2.Rational = 1/2
  val y = new Rational(2, 3)                      //> y  : Week2.Rational = 2/3
  x.add(y)                                        //> res1: Week2.Rational = 7/6

}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
      
  override def toString = numer + "/" + denom

}