package forcomp

object list_testing {
	val x = (1,2) :: Nil                      //> x  : List[(Int, Int)] = List((1,2))
	println(x.toList)                         //> List((1,2))
	val y = (for {
		i <- 0 to 1
		j <- 0 to 1
	}	yield (i,j)).toList               //> y  : List[(Int, Int)] = List((0,0), (0,1), (1,0), (1,1))
	println(y)                                //> List((0,0), (0,1), (1,0), (1,1))
}