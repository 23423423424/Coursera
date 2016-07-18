package week4

object functions {
	val f = (x: Int) => x * x                 //> f  : Int => Int = <function1>
	f(7)                                      //> res0: Int = 49
	val f1 = new Function[Int, Int]{
		def apply(x: Int) = x * x
	}                                         //> f1  : Function[Int,Int] = <function1>
	f.apply(7)                                //> res1: Int = 49
}