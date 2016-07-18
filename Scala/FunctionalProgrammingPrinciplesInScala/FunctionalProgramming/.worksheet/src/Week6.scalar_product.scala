package Week6

object scalar_product {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(28); 
  val x = Vector(1.0, 2, 3);System.out.println("""x  : scala.collection.immutable.Vector[Double] = """ + $show(x ));$skip(28); 
  val y = Vector(1.0, 2, 3);System.out.println("""y  : scala.collection.immutable.Vector[Double] = """ + $show(y ));$skip(22); val res$0 = 
  scalarProduct(x, y);System.out.println("""res0: Double = """ + $show(res$0));$skip(126); 
  
  def scalarProduct1(xs: Vector[Double], ys: Vector[Double]): Double =
  	(xs zip ys).map{
  		case(x,y) => x * y
  	}.sum;System.out.println("""scalarProduct1: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(23); val res$1 = 
  scalarProduct1(x, y);System.out.println("""res1: Double = """ + $show(res$1));$skip(73); 
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(16); val res$2 = 
  
  isPrime(4);System.out.println("""res2: Boolean = """ + $show(res$2))}
  	
  
  
  
  
}
