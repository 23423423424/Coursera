package week5

object variations_of_filter {
	// xs filterNot p the list consisting of those elements of xs that do not satisfy the predicate p
	// xs partition p same as (xs filter p, xs filterNot p)
	// xs takeWhile p the longest prefix of list xs consisting of elements that all satisfy the predicate p
	// xs dropWhile p the remainder of the list xs after any leading elements satisfying p have been removed
	// xs span p same as (xs takeWhile p, xs dropWhile p)
	
	val nums = List(1,3,-1,2)                 //> nums  : List[Int] = List(1, 3, -1, 2)
	val fruits = List("apple", "orange", "grape")
                                                  //> fruits  : List[String] = List(apple, orange, grape)
	
	nums filter (x => x > 0)                  //> res0: List[Int] = List(1, 3, 2)
	nums filterNot (x => x > 0)               //> res1: List[Int] = List(-1)
	nums partition (x => x > 0)               //> res2: (List[Int], List[Int]) = (List(1, 3, 2),List(-1))
	
	nums takeWhile (x => x > 0)               //> res3: List[Int] = List(1, 3)
	nums dropWhile (x => x > 0)               //> res4: List[Int] = List(-1, 2)
	nums span (x => x > 0)                    //> res5: (List[Int], List[Int]) = (List(1, 3),List(-1, 2))
	
}