package week1_ComputationsInParallel

object estimatingPieParallel {
	def monteCarloPiPar(iter: Int): Double = {
		val ((pi1, pi2), (pi3, pi4)) = parallel(
			parallel(mcCount(iter/4), mcCount(iter/4)),
			parallel(mcCount(iter/4), mcCount(iter - 3*(iter/4))))
			4.0 * (pi1 + pi2 + pi3 + pi4) / iter
	}
}