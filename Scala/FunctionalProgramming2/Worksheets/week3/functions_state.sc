package week3

object functions_state {
	def iterate(n: Int, f: Int => Int, x: Int): Int =
		if (n == 0) x else iterate(n-1, f, f(x))
                                                  //> iterate: (n: Int, f: Int => Int, x: Int)Int
	def square(x: Int) = x * x                //> square: (x: Int)Int
	
	iterate(0, square, 3)                     //> res0: Int = 3
	
	var x: String = "abc"                     //> x  : String = abc
	var count = 111                           //> count  : Int = 111
	x = "hi"
	count = count + 1
	println(x)                                //> hi
	println(count)                            //> 112
}