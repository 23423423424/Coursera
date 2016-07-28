package week1_ComputationsInParallel

object segmentRec {
	// general signature of parallel
	def parallel[A, B](taskA: => A, taskB: => B): (A, B) = { ... }

	def pNormRec(a: Array[Int], p: Double): Int =
		power(segmentRec(a, p, 0, a.length), 1/p)
		
	// like sum segment but parallel
	def segmentRec(a: Array[Int], p: Double, s: Int, t: Int) = {
		if (t - s < threshold)
			sumSegment(a, p, s, t) // small segment: do it sequentially
		else {
			val m = s + (t - s)/2
			val (sum1, sum2) = parallel(segmentRec(a, p, s, m),
				segmentRec(a, p, m, t))
			sum1 + sum2
			}
		}
	}
}