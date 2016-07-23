package streams

object testing {
  val x = Vector(1,2,3)                           //> x  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  x.indexWhere(x => x == 1, 0)                    //> res0: Int = 0
  val y = Vector(1,1,2,3,4,4)                     //> y  : scala.collection.immutable.Vector[Int] = Vector(1, 1, 2, 3, 4, 4)
  
  // finds the first index satisfying some predicate after the start position
  y.indexWhere(x => x == 4, 5)                    //> res1: Int = 5
  
  // find index of first occurrence of some value in this immutable sequence
  y.indexOf(4)                                    //> res2: Int = 4
  
  
}