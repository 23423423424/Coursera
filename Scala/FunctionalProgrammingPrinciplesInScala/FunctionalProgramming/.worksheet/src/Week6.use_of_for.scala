package Week6

object use_of_for {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(12); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(85); val res$0 = 
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(42); val res$1 = 

  for {
    i <- 1 until n
  } yield (i);System.out.println("""res1: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$1));$skip(24); 

	val x = List(1.0,2,3);System.out.println("""x  : List[Double] = """ + $show(x ));$skip(23); 
	val y = List(1.0,2,3);System.out.println("""y  : List[Double] = """ + $show(y ));$skip(114); 
	def scalarProduct(xs: List[Double], ys: List[Double]): Double =
		(for {
			(x,y) <- x zip y
		}yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(23); val res$2 = 
		
	scalarProduct(x,y);System.out.println("""res2: Double = """ + $show(res$2))}




}
