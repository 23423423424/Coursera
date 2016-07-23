package calculator

object map_testing {
  val x = Map((1 -> 3), (2 -> 4))                 //> x  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 3, 2 -> 4)
  x(1)                                            //> res0: Int = 3
  var y = 3                                       //> y  : Int = 3
  val q = y -> 2                                  //> q  : (Int, Int) = (3,2)
  val x1 = (3,2)                                  //> x1  : (Int, Int) = (3,2)
  Map(x1,q)                                       //> res1: scala.collection.immutable.Map[Int,Int] = Map(3 -> 2)
  x1 == q                                         //> res2: Boolean = true
  println(q)                                      //> (3,2)
 	val xs = Map(1 -> 2, 2 -> 3, 3 -> 4)      //> xs  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 2 -> 3, 3 -> 4)
	val ys = xs - 1                           //> ys  : scala.collection.immutable.Map[Int,Int] = Map(2 -> 3, 3 -> 4)
	val zs = xs.filterKeys(_ != 1)            //> zs  : scala.collection.immutable.Map[Int,Int] = Map(2 -> 3, 3 -> 4)
}