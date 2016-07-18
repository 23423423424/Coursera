package Week6

object scalar_product {
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map(xy => xy._1 * xy._2).sum      //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  val x = Vector(1.0, 2, 3)                       //> x  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0)
  val y = Vector(1.0, 2, 3)                       //> y  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0)
  scalarProduct(x, y)                             //> res0: Double = 14.0
  
  def scalarProduct1(xs: Vector[Double], ys: Vector[Double]): Double =
  	(xs zip ys).map{
  		case(x,y) => x * y
  	}.sum                                     //> scalarProduct1: (xs: Vector[Double], ys: Vector[Double])Double
  scalarProduct1(x, y)                            //> res1: Double = 14.0
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  
  isPrime(4)                                      //> res2: Boolean = false
  	
  
  
  
  
}