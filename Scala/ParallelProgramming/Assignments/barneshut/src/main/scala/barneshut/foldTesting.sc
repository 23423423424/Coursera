package barneshut

object foldTesting {
	val x = Seq(1,2,3)                        //> x  : Seq[Int] = List(1, 2, 3)
	x.foldLeft(0)((x,y) => x + y)             //> res0: Int = 6
	
}