package Week2

object Sheet6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 

	val x = new Rational1(1,3);System.out.println("""x  : Week2.Rational1 = """ + $show(x ));$skip(28); 
	val y = new Rational1(5,7);System.out.println("""y  : Week2.Rational1 = """ + $show(y ));$skip(28); 
	val z = new Rational1(3,2);System.out.println("""z  : Week2.Rational1 = """ + $show(z ));$skip(9); val res$0 = 
	x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
	x.add(y);System.out.println("""res2: Week2.Rational1 = """ + $show(res$2));$skip(17); val res$3 = 
	x.sub(y).sub(z);System.out.println("""res3: Week2.Rational1 = """ + $show(res$3))}
	
}

class Rational1(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational1) =
    new Rational1(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
      
  def neg: Rational1 = new Rational1(-numer, denom)
  
  def sub(that: Rational1) = add(that.neg)
      
  override def toString = numer + "/" + denom

}
