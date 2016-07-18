package Week1

object sheet4 {
	// tail recursive version
	def factorial(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if(n == 0) acc
			else loop(acc * n, n - 1)
		loop(1,n)
	}                                         //> factorial: (n: Int)Int
	factorial(4)                              //> res0: Int = 24
}