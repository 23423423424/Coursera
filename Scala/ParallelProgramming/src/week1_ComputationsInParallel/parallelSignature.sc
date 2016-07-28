package week1_ComputationsInParallel

object parallelSignature {
	def parallel[A, B](taskA: => A, taskB: => B): (A, B) = { ... }
	def parallel1[A, B](taskA: A, taskB: B): (A, B) = { ... }
	
	// what is the difference between these two computations
	val (va, vb) = parallel(a, b)
	val (va, vb) = parallel1(a, b)
	
	// The second computation evaluates sequentially as in val (va, vb) = (a, b)
	// For parallelism, need to pass unevaluated computations
}