package patmat

object testing2 {

	var x = 1 :: 2 :: Nil                     //> x  : List[Int] = List(1, 2)
	var y = 3 :: 4 :: Nil                     //> y  : List[Int] = List(3, 4)
	var z = x ::: y                           //> z  : List[Int] = List(1, 2, 3, 4)
	var x1 = List(1,2,3,4)                    //> x1  : List[Int] = List(1, 2, 3, 4)
var x2 = List(5,6,7)                              //> x2  : List[Int] = List(5, 6, 7)

	println(List(x1,x2).flatMap(x=>x))        //> List(1, 2, 3, 4, 5, 6, 7)

}