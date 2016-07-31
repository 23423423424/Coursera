package kmeans

object zipTesting {
	val x = Array(1,2,3)                      //> x  : Array[Int] = Array(1, 2, 3)
	val y = Array(4,5,6)                      //> y  : Array[Int] = Array(4, 5, 6)
	val z = x.zip(y)                          //> z  : Array[(Int, Int)] = Array((1,4), (2,5), (3,6))
	z.map(x => (x._1 < 5 && x._2 > 2))        //> res0: Array[Boolean] = Array(true, true, true)
	z.contains(false)                         //> res1: Boolean = false
	
}