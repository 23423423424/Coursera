package week5
import math.Ordering

object mergesort_implementation {
	def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
  //def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge_better(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          //if (lt(x, y)) x :: merge_better(xs1, ys)
          if (ord.lt(x,y)) x :: merge_better(xs1, ys)
          else y :: merge_better(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge_better(msort(fst), msort(snd))
    }
  }                                               //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
	val nums = List(4,3,1,-19,9)              //> nums  : List[Int] = List(4, 3, 1, -19, 9)
	//println(msort(nums)((x: Int, y: Int) => x < y))
	println(msort(nums))                      //> List(-19, 1, 3, 4, 9)
	val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
	//println(msort(fruits)((x: String, y: String) => x.compareTo(y) < 0))
	println(msort(fruits))                    //> List(apple, banana, orange, pineapple)
}