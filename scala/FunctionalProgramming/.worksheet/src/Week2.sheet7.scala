package Week2

object Sheet7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 

  val x = new Rational2(1, 3);System.out.println("""x  : Week2.Rational2 = """ + $show(x ));$skip(30); 
  val y = new Rational2(5, 7);System.out.println("""y  : Week2.Rational2 = """ + $show(y ));$skip(30); 
  val z = new Rational2(3, 2);System.out.println("""z  : Week2.Rational2 = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: Week2.Rational2 = """ + $show(res$2));$skip(18); val res$3 = 
  x.sub(y).sub(z);System.out.println("""res3: Week2.Rational2 = """ + $show(res$3));$skip(11); val res$4 = 
  y.add(y);System.out.println("""res4: Week2.Rational2 = """ + $show(res$4));$skip(12); val res$5 = 
  x.less(y);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(4); val res$6 = 
  x;System.out.println("""res6: Week2.Rational2 = """ + $show(res$6));$skip(4); val res$7 = 
  y;System.out.println("""res7: Week2.Rational2 = """ + $show(res$7));$skip(11); val res$8 = 
  x.max(y);System.out.println("""res8: Week2.Rational2 = """ + $show(res$8));$skip(19); val res$9 = 
  new Rational2(2);System.out.println("""res9: Week2.Rational2 = """ + $show(res$9))}
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
