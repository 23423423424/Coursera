package Week2

object Sheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(174); 
  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom);System.out.println("""addRational: (r: Week2.Rational, s: Week2.Rational)Week2.Rational""");$skip(61); 

  def makeString(r: Rational) =
    r.numer + "/" + r.denom;System.out.println("""makeString: (r: Week2.Rational)String""");$skip(67); val res$0 = 

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)));System.out.println("""res0: String = """ + $show(res$0));$skip(30); 

  val x = new Rational(1, 2);System.out.println("""x  : Week2.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(2, 3);System.out.println("""y  : Week2.Rational = """ + $show(y ));$skip(11); val res$1 = 
  x.add(y);System.out.println("""res1: Week2.Rational = """ + $show(res$1))}

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
