package week5

object last {
	def last1[T](xs: List[T]): T = xs match{
		case List() => throw new Error("last of empty list")
		case List(x) => x
		case y :: ys => last1(ys)
	}                                         //> last1: [T](xs: List[T])T
	println(last1(List(1,2,3)))               //> 3
}