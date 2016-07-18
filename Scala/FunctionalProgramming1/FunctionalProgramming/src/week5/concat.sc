package week5

object concat {
	def factorial(n: Int): Int =
		if (n==0) 1
		else n * factorial(n-1)
	
	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match{
		case List() => ys
		case x :: xs1 => x :: concat(xs1, ys)
	}
	
}