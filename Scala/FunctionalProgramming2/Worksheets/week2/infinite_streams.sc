package week2

object infinite_streams {
	def from(n: Int): Stream[Int] = n #:: from(n+1)
                                                  //> from: (n: Int)Stream[Int]
  val nats = from(0)                              //> nats  : Stream[Int] = Stream(0, ?)
  val m4s = nats map(_ * 4)                       //> m4s  : scala.collection.immutable.Stream[Int] = Stream(0, ?)
  (m4s take 10).toList                            //> res0: List[Int] = List(0, 4, 8, 12, 16, 20, 24, 28, 32, 36)
	def sieve(s: Stream[Int]): Stream[Int] =
		s.head #:: sieve(s.tail filter (_ % s.head != 0))
                                                  //> sieve: (s: Stream[Int])Stream[Int]
  val primes = sieve(from(2))                     //> primes  : Stream[Int] = Stream(2, ?)
  primes.take(10).toList                          //> res1: List[Int] = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
  
  def sqrtStream(x: Double): Stream[Double] = {
  	def improve(guess: Double) = (guess + x/ guess) / 2
  	lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
  	guesses
  }                                               //> sqrtStream: (x: Double)Stream[Double]
  
  def isGoodEnough(guess: Double, x: Double) =
  	math.abs((guess * guess - x) / x) < 0.0001//> isGoodEnough: (guess: Double, x: Double)Boolean
  
  sqrtStream(4).filter(isGoodEnough(_, 4)).take(10).toList
                                                  //> res2: List[Double] = List(2.0000000929222947, 2.000000000000002, 2.0, 2.0, 2
                                                  //| .0, 2.0, 2.0, 2.0, 2.0, 2.0)
  
  var n = 4                                       //> n  : Int = 4
  val xs = from(1) map(_*n)                       //> xs  : scala.collection.immutable.Stream[Int] = Stream(4, ?)
  xs.take(10).toList                              //> res3: List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)
  
  
  
  
  
}