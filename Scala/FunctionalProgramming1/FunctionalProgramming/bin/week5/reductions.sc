package week5

object reductions {
	val x = List(1,2,3,4)                     //> x  : List[Int] = List(1, 2, 3, 4)
	def sum(xs: List[Int]): Int = xs match {
		case Nil => 0
		case y :: ys => y + sum(ys)
	}                                         //> sum: (xs: List[Int])Int
	sum(x)                                    //> res0: Int = 10
	
	// reduceLeft
	
	def sum2(xs: List[Int]) = (0 :: xs) reduceLeft((x,y) => x + y)
                                                  //> sum2: (xs: List[Int])Int
	sum2(x)                                   //> res1: Int = 10
	
	def product(xs: List[Int]) = (1 :: xs) reduceLeft((x,y) => x*y)
                                                  //> product: (xs: List[Int])Int
	product(x)                                //> res2: Int = 24
	
	def product2(xs: List[Int]) = (1 :: xs) reduceLeft(_ * _)
                                                  //> product2: (xs: List[Int])Int
	product2(x)                               //> res3: Int = 24
	
	
	
	
	
	
	
	
	
	
}