package week1_ComputationsInParallel

// define the body of the parallel construct using task
// correct
def parallel[A,B](cA: => A, cB: => B): (A,B) = {
	val tB: Task[B] = task { cb }
	val tA: A = cA
	(tA, tB.join)
}

// wrong
// does not obtain the benefit of parallelization
def parallelWrong[A,B](cA: => A, cB: => B): (A, B) = {
	val tB: B = (task { cB }).join
	val tA: A = cA
	(tA, tB)
}