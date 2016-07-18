package Week6

object map_testing {
	var x = Map(1 -> 2, 2 -> 3)               //> x  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 2 -> 3)
	println(x)                                //> Map(1 -> 2, 2 -> 3)
	x(1)                                      //> res0: Int = 2
 	x = x + (1 -> (x(1) + 1) )
 	println(x)                                //> Map(1 -> 3, 2 -> 3)
	
}