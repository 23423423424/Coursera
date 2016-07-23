package streams

object testingFlatten {
	val x = List(List(1,2,3),List(4,5,6)).flatten
                                                  //> x  : List[Int] = List(1, 2, 3, 4, 5, 6)
	println(x)                                //> List(1, 2, 3, 4, 5, 6)
}