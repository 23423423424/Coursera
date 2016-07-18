package Week6

object sequence_operations {
	val xs = Array(1,2,3,4)                   //> xs  : Array[Int] = Array(1, 2, 3, 4)
	val ys = Array(5,6,7,8)                   //> ys  : Array[Int] = Array(5, 6, 7, 8)
	xs exists (x => x == 1)                   //> res0: Boolean = true
	xs forall (x => x == 1)                   //> res1: Boolean = false
	xs zip ys                                 //> res2: Array[(Int, Int)] = Array((1,5), (2,6), (3,7), (4,8))
	val z = xs zip ys                         //> z  : Array[(Int, Int)] = Array((1,5), (2,6), (3,7), (4,8))
	z.unzip                                   //> res3: (Array[Int], Array[Int]) = (Array(1, 2, 3, 4),Array(5, 6, 7, 8))
	xs flatMap (x => List(0,x))               //> res4: Array[Int] = Array(0, 1, 0, 2, 0, 3, 0, 4)
	xs.sum                                    //> res5: Int = 10
	xs.product                                //> res6: Int = 24
	xs.max                                    //> res7: Int = 4
	xs.min                                    //> res8: Int = 1
}