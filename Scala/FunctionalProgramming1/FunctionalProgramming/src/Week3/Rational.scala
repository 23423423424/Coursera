package Week3

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x
  def denom = y

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this.less(that)) that
    else this

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = {
    val g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }

}