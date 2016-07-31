package barneshut

object sequenceTesting {
	val x = Seq(1,2,3)                        //> x  : Seq[Int] = List(1, 2, 3)
	println(x)                                //> List(1, 2, 3)
	val y = List(1,2,3)                       //> y  : List[Int] = List(1, 2, 3)
	x == y                                    //> res0: Boolean = true
	
}