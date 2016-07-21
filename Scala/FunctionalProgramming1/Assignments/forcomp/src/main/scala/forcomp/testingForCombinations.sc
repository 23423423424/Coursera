package forcomp

object testingForCombinations {
  type Occurrences = List[(Char, Int)]

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case x :: xs => (for {
        i <- 0 to x._2
        a <- combinations(xs)
      } yield if (i == 0) a else (x._1, i) :: a).toList
    }
  }                                               //> combinations: (occurrences: forcomp.testingForCombinations.Occurrences)List[
                                                  //| forcomp.testingForCombinations.Occurrences]
  combinations(List(('a', 1), ('b', 1)))          //> res0: List[forcomp.testingForCombinations.Occurrences] = List(List(), List((
                                                  //| b,1)), List((a,1)), List((a,1), (b,1)))
}