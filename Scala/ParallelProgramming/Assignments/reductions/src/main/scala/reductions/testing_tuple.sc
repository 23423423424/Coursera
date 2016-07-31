package reductions

object testing_tuple {
	def tuple() = (1,2)                       //> tuple: ()(Int, Int)
	val x = tuple()                           //> x  : (Int, Int) = (1,2)
	val (y,z) = tuple()                       //> y  : Int = 1
                                                  //| z  : Int = 2
 	x == (y,z)                                //> res0: Boolean = true
 	
}