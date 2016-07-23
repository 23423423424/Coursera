package streams

object testing_vectors {
	val x = Vector(Vector(1,2), Vector(3,4))  //> x  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Int]
                                                  //| ] = Vector(Vector(1, 2), Vector(3, 4))
	val vector = x.indexWhere(_.indexOf(1) >= 0)
                                                  //> vector  : Int = 0
	val position = x(vector).indexOf(2)       //> position  : Int = 1
	(1,0)                                     //> res0: (Int, Int) = (1,0)
}