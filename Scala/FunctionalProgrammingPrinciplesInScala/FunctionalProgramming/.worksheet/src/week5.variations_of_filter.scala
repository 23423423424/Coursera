package week5

object variations_of_filter {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(495); 
	// xs filterNot p the list consisting of those elements of xs that do not satisfy the predicate p
	// xs partition p same as (xs filter p, xs filterNot p)
	// xs takeWhile p the longest prefix of list xs consisting of elements that all satisfy the predicate p
	// xs dropWhile p the remainder of the list xs after any leading elements satisfying p have been removed
	// xs span p same as (xs takeWhile p, xs dropWhile p)
	
	val nums = List(1,3,-1,2);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(47); 
	val fruits = List("apple", "orange", "grape");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(28); val res$0 = 
	
	nums filter (x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(29); val res$1 = 
	nums filterNot (x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(29); val res$2 = 
	nums partition (x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(31); val res$3 = 
	
	nums takeWhile (x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(29); val res$4 = 
	nums dropWhile (x => x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(24); val res$5 = 
	nums span (x => x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5))}
	
}
