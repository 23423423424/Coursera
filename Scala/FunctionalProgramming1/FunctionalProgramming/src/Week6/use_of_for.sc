package Week6

object use_of_for {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
                                                  //> isPrime: (n: Int)Boolean
  val n = 7                                       //> n  : Int = 7
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

  for {
    i <- 1 until n
  } yield (i)                                     //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6)

	val x = List(1.0,2,3)                     //> x  : List[Double] = List(1.0, 2.0, 3.0)
	val y = List(1.0,2,3)                     //> y  : List[Double] = List(1.0, 2.0, 3.0)
	def scalarProduct(xs: List[Double], ys: List[Double]): Double =
		(for {
			(x,y) <- x zip y
		}yield x * y).sum                 //> scalarProduct: (xs: List[Double], ys: List[Double])Double
		
	scalarProduct(x,y)                        //> res2: Double = 14.0




}