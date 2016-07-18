package recfun

object Pascal {
	//0,2 = 1 1,2 = 2 1,2 = 2
	//return 1 if the value is on the edge of the triangle
	//else return the two numbers above the location
	def pascal(c: Int, r: Int): Int =
		if (c == 0) 1
		else if(c == r) 1
		else pascal(c-1, r-1) + pascal(c,r-1)
                                                  //> pascal: (c: Int, r: Int)Int
	
	pascal(0,2)                               //> res0: Int = 1
	pascal(1,2)                               //> res1: Int = 2
	
}