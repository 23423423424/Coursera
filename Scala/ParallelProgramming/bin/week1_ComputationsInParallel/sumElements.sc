package week1_ComputationsInParallel

object sumElements {
	def sum1(a: Array[Int], p: Double, s: Int, t: Int): Int = {
		var i = s; var sum: Int = 0
		while (i < t) {
			sum = sum + a(i)
			i = i + 1
		}
		sum
	}
	// hard to obtain a speedup memory is a bottleneck
	val ((sum1, sum2), (sum3,sum4)) = parallel(
		parallel(sum1(a, p, 0, m1), sum1(a, p, m1, m2)),
		parallel(sum1(a, p, m2, m3), sum1(a, p, m3, a.length)))
}