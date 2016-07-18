package week5

object init_implementation {
	def init[T](xs: List[T]): List[T] = xs match {
		case List() => throw new Error("init of empty list")
		case List(x) => List()
		case x :: xs => x :: init(xs)
	}                                         //> init: [T](xs: List[T])List[T]
	println(init(List(1,2,3)))                //> List(1, 2)
}