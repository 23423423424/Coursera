package week5

object reverse_implementation {
	def reverse[T](xs: List[T]): List[T] = xs match {
		case List() => xs
		case y :: ys => reverse(ys) ++ List(y)
	}                                         //> reverse: [T](xs: List[T])List[T]
	reverse(List(1,2,3))                      //> res0: List[Int] = List(3, 2, 1)
}