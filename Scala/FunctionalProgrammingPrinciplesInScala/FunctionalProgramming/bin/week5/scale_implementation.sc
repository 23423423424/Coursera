package week5

object scale_implementation {
	def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
		case Nil => xs
		case y :: ys => y * factor :: scaleList(ys, factor)
	}                                         //> scaleList: (xs: List[Double], factor: Double)List[Double]
	val x = List(1.0,2,3,4)                   //> x  : List[Double] = List(1.0, 2.0, 3.0, 4.0)
	val x_int = List(-1,2,3,4)                //> x_int  : List[Int] = List(-1, 2, 3, 4)
	println(scaleList(x,2))                   //> List(2.0, 4.0, 6.0, 8.0)
	def scaleList2(xs: List[Double], factor: Double) =
		xs map (x => x * factor)          //> scaleList2: (xs: List[Double], factor: Double)List[Double]
	println(scaleList2(x,2))                  //> List(2.0, 4.0, 6.0, 8.0)
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case x :: xs => x*x :: squareList(xs)
	}                                         //> squareList: (xs: List[Int])List[Int]
	def squareList2(xs: List[Int]): List[Int] =
		xs map (x => x*x)                 //> squareList2: (xs: List[Int])List[Int]
	println(squareList2(x_int))               //> List(1, 4, 9, 16)
	// selecting all elements satisfying a given condition
	def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
	}                                         //> posElems: (xs: List[Int])List[Int]
	println(posElems(x_int))                  //> List(2, 3, 4)
	// posElems can be generalized to a method using the filter the class
	def posElems1(xs: List[Int]): List[Int] =
		xs filter (x => x > 0)            //> posElems1: (xs: List[Int])List[Int]
	println(posElems1(x_int))                 //> List(2, 3, 4)
	
	
	
}