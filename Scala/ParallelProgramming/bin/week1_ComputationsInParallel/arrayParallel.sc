package week1_ComputationsInParallel

object arrayParallel {

	def power(x: Int, p: Double): Int = math.exp(p * math.log(math.abs(x))).toInt
	
	def sumSegment(a: Array[Int], p: Double, s: Int, t: Int): Int = {
		var i = s; var sum: Int = 0
		while (i < t){
			sum = sum + power(a(i), p)
			i = i + 1
		}
		sum
	}
	def pNorm(a: Array[Int], p: Double): Int =
		power(sumSegment(a, p, 0, a.length), 1/p)
	
	def pNormTwoPart(a: Array[Int], p: Double): Int = {
		val m = a.length /2
		val (sum1, sum2) = parallel(sumSegment(a, p, 0, m), sumSegment(a, p, m, a.length))
		power(sum1 + sum2, 1/p)
	}
	def pNormFourPart(a: Array[Int], p: Double): Int = {
		val m1 = a.length /4; val m2 = a.length/2; val m3 = 3*a.length/4
		val ((sum1, sum2),(sum3,sum4)) =
			parallel(parallel(sumSegment(a, p, 0, m1), sumSegment(a, p, m, m2)),
				parallel(sumSegment(a,p,m2,m3), sumSegment(a,p,m3,a.length))
		power(sum1 + sum2, 1/p)
	}
	
	
	
	
	
	
	
}