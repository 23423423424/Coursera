package week2

object streams {
  def isOdd(x: Int): Boolean =
    if (x % 2 == 0) false
    else true                                     //> isOdd: (x: Int)Boolean
  //poor performance computes everything
  ((1 to 5).toStream filter isOdd)(1)             //> res0: Int = 3
  //streams
  val xs = Stream.cons(1, Stream.cons(2, Stream.empty))
                                                  //> xs  : Stream.Cons[Int] = Stream(1, ?)
  val ys = Stream(1, 2, 3)                        //> ys  : scala.collection.immutable.Stream[Int] = Stream(1, ?)

  val z = (1 to 1000).toStream                    //> z  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  // what this means is that the stream is a list so it starts at 1 but the tail is not evalutated

  def streamRange(lo: Int, hi: Int): Stream[Int] =
    if (lo >= hi) Stream.empty
    else Stream.cons(lo, streamRange(lo + 1, hi)) //> streamRange: (lo: Int, hi: Int)Stream[Int]

  def listRange(lo: Int, hi: Int): List[Int] =
    if (lo >= hi) Nil
    else lo :: listRange(lo + 1, hi)              //> listRange: (lo: Int, hi: Int)List[Int]
    
  streamRange(1,10).take(3).toList                //> res1: List[Int] = List(1, 2, 3)

	    

}