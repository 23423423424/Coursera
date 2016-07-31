package barneshut

object concattesting {
	val x = List(1,2,3)                       //> x  : List[Int] = List(1, 2, 3)
	val y = List(4,5,6)                       //> y  : List[Int] = List(4, 5, 6)
	x :: y                                    //> res0: List[Any] = List(List(1, 2, 3), 4, 5, 6)
	x +: y                                    //> res1: List[Any] = List(List(1, 2, 3), 4, 5, 6)
	val z = Array(Array(1,2,3),4,5,6)         //> z  : Array[Any] = Array(Array(1, 2, 3), 4, 5, 6)
	z :: x                                    //> res2: List[Any] = List(Array(Array(1, 2, 3), 4, 5, 6), 1, 2, 3)
	z +: x                                    //> res3: List[Any] = List(Array(Array(1, 2, 3), 4, 5, 6), 1, 2, 3)
	
	def run(x: Int) = x match {
		case z@x =>
			z + 1
	}                                         //> run: (x: Int)Int
	run(2)                                    //> res4: Int = 3
	
}