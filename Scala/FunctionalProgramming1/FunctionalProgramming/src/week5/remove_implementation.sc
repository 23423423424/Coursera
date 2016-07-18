package week5

object remove_implementation {
	def removeAt(xs: List[Int], n: Int) = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt: (xs: List[Int], n: Int)List[Int]
	println( removeAt( List(1,2,3),1 ) )      //> List(1, 3)
}