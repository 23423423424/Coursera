package week5

object sheet1 {
	var xs = List(1,2,3)                      //> xs  : List[Int] = List(1, 2, 3)
	var ys = List(4,5,6)                      //> ys  : List[Int] = List(4, 5, 6)
	println(xs)                               //> List(1, 2, 3)
	println(xs.length)                        //> 3
	println(xs.last)                          //> 3
	println(xs.init)                          //> List(1, 2)
	println(xs take 2)                        //> List(1, 2)
	println(xs drop 2)                        //> List(3)
	println(xs(1))                            //> 2
	var temp = xs ++ ys                       //> temp  : List[Int] = List(1, 2, 3, 4, 5, 6)
	println(temp)                             //> List(1, 2, 3, 4, 5, 6)
	println(xs.reverse)                       //> List(3, 2, 1)
	println(xs updated (0,1))                 //> List(1, 2, 3)
	println(xs indexOf 1)                     //> 0
	println(xs contains 1)                    //> true
	
	
	
	
	
	
	
	
	
	
	
	
}