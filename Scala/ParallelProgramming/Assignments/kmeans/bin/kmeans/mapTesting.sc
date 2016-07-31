package kmeans

object mapTesting {
	val x = Array(1,2,3)                      //> x  : Array[Int] = Array(1, 2, 3)
	val z = x.map((_,Array)).toMap            //> z  : scala.collection.immutable.Map[Int,Array.type] = Map(1 -> scala.Array$@4
                                                  //| ec44deb, 2 -> scala.Array$@4ec44deb, 3 -> scala.Array$@4ec44deb)
  val y = Array(1,2,3)                            //> y  : Array[Int] = Array(1, 2, 3)
  val k = z ++ y                                  //> k  : scala.collection.immutable.Iterable[Any] = List((1,scala.Array$@4ec44de
                                                  //| b), (2,scala.Array$@4ec44deb), (3,scala.Array$@4ec44deb), 1, 2, 3)
  
	
	
	
}