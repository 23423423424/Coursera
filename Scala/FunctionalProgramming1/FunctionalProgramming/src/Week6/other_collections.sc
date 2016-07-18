package Week6

object other_collections {
	val nums = Vector(1, 2, 3, -48)           //> nums  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, -48)
	val people = Vector("Bob", "Jack", "John","Ryan")
                                                  //> people  : scala.collection.immutable.Vector[String] = Vector(Bob, Jack, John
                                                  //| , Ryan)
 	println(nums +: people)                   //> Vector(Vector(1, 2, 3, -48), Bob, Jack, John, Ryan)
	println(nums :+ people)                   //> Vector(1, 2, 3, -48, Vector(Bob, Jack, John, Ryan))
	
	val xs = Array(1,2,3,44)                  //> xs  : Array[Int] = Array(1, 2, 3, 44)
	xs map (x => x * 2)                       //> res0: Array[Int] = Array(2, 4, 6, 88)
	
	val s = "Hello World"                     //> s  : String = Hello World
	s filter (c => c.isUpper)                 //> res1: String = HW
	
	val r: Range = 1 until 5                  //> r  : Range = Range(1, 2, 3, 4)
	val s1: Range = 1 to 5                    //> s1  : Range = Range(1, 2, 3, 4, 5)
	1 to 10 by 3                              //> res2: scala.collection.immutable.Range = Range(1, 4, 7, 10)
	6 to 1 by -2                              //> res3: scala.collection.immutable.Range = Range(6, 4, 2)
	
	
	
	
	
	
	
}