package Week2

object Sheet7 {

  val x = new Rational2(1, 3)                     //> x  : Week2.Rational2 = 1/3
  val y = new Rational2(5, 7)                     //> y  : Week2.Rational2 = 5/7
  val z = new Rational2(3, 2)                     //> z  : Week2.Rational2 = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.add(y)                                        //> res2: Week2.Rational2 = 22/21
  x.sub(y).sub(z)                                 //> res3: Week2.Rational2 = -79/42
  y.add(y)                                        //> res4: Week2.Rational2 = 10/7
  x.less(y)                                       //> res5: Boolean = true
  x                                               //> res6: Week2.Rational2 = 1/3
  y                                               //> res7: Week2.Rational2 = 5/7
  x.max(y)                                        //> res8: Week2.Rational2 = 5/7
  new Rational2(2)                                //> res9: Week2.Rational2 = 2/1
}

class Rational2(x: Int, y: Int) {


  require(y != 0, "denominator must be nonzero")

	def this(x: Int) = this(x,1)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  def numer = x
  def denom = y

  def less(that: Rational2) = numer * that.denom < that.numer * denom

  def less1(that: Rational2) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational2) =
    if (this.less(that)) that
    else this

  def add(that: Rational2) =
    new Rational2(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg: Rational2 = new Rational2(-numer, denom)

  def sub(that: Rational2) = add(that.neg)

  override def toString = {
  	val g = gcd(numer, denom)
  	numer/g + "/" + denom/g
  }

}