package week5

object foldLeft {
	val x = List(1,2,3,4)                     //> x  : List[Int] = List(1, 2, 3, 4)
	def sum(xs: List[Int]) = (xs foldLeft 0) (_+_)
                                                  //> sum: (xs: List[Int])Int
	sum(x)                                    //> res0: Int = 10
	def product(xs: List[Int]) = (xs foldLeft 1) (_*_)
                                                  //> product: (xs: List[Int])Int
	product(x)                                //> res1: Int = 24
}