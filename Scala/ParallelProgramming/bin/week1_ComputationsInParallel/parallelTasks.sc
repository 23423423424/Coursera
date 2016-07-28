package week1_ComputationsInParallel

val ( (part1,part2),(part3,part4) ) =
	parallel(
		parallel(sumSegment(a, p, 0, mid1),
			sumSegment(a, p, mid1, mid2)),
		parallel(sumSegment(a, p, mid2, mid3),
			sumSegment(a, p, mid3, a.length))
			)
	power(part1 + part2 + part3 + part4, 1/p)
	
// same computation expressed using task

val t1 = task { sumSegment(a, p, 0, mid1) }
val t2 = task { sumSegment(a, p, mid1, mid2) }
val t3 = task { sumSegment(a, p, mid2, mid3) }
val t4 = task { sumSegment(a, p, mid3, a.length) }
power(t1 + t2 + t3 + t4, 1/p)
			