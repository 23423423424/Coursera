package week5

object concatenation_implementation {

	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
		case List() => ys
		case z :: zs => z :: concat(zs,ys)
	}                                         //> concat: [T](xs: List[T], ys: List[T])List[T]
	println(concat(List(1,2,3),List(4,5,6)))  //> List(1, 2, 3, 4, 5, 6)
	
}