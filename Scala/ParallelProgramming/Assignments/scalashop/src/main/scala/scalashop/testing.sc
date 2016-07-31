package scalashop

object testing {
	val x = 10                                //> x  : Int = 10
	val end = 10                              //> end  : Int = 10
	val y = 4                                 //> y  : Int = 4
	val xs = Math.ceil(x/y.toDouble)          //> xs  : Double = 3.0
	var start = (for{
		i <- 0 until x by 4
	}yield i).toList                          //> start  : List[Int] = List(0, 4, 8)
	println(start)                            //> List(0, 4, 8)

	var zipped = start.map(x => (x,Math.min(x+4,end)))
                                                  //> zipped  : List[(Int, Int)] = List((0,4), (4,8), (8,10))
	
	
	
	
	
}