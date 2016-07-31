package reductions

object arrayTesting {
	val x = Array(1,2,3,4)                    //> x  : Array[Int] = Array(1, 2, 3, 4)
	println(x.head)                           //> 1
	println(x.tail)                           //> [I@1c3a0533
	x.toList                                  //> res0: List[Int] = List(1, 2, 3, 4)
	x.isEmpty                                 //> res1: Boolean = false
	
	
}