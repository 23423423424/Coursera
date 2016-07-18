package Week6

object combinations_implementation {
	val x = List(1,2,3)                       //> x  : List[Int] = List(1, 2, 3)
	val y = List(4,5,6)                       //> y  : List[Int] = List(4, 5, 6)
	var z = (1 to 3) flatMap(x => (1 to 2) map (y => (x,y)))
                                                  //> z  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2)
                                                  //| , (2,1), (2,2), (3,1), (3,2))
	println(z)                                //> Vector((1,1), (1,2), (2,1), (2,2), (3,1), (3,2))
}