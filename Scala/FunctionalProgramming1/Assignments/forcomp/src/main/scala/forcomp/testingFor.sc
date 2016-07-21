package forcomp

object testingFor {

  type Occurrences = List[(Char, Int)]

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case x if (x.isEmpty) => List(Nil)
      case head :: tail => head match {
        case (ch, weight) =>
          for {
            rest <- combinations(tail)
            i <- 0 to weight
          } yield if (i > 0) (ch, i) :: rest else rest
      }
    }
  }                                               //> combinations: (occurrences: forcomp.testingFor.Occurrences)List[forcomp.test
                                                  //| ingFor.Occurrences]
  

  combinations(List(('a', 1), ('b', 1)))          //> res0: List[forcomp.testingFor.Occurrences] = List(List(), List((a,1)), List(
                                                  //| (b,1)), List((a,1), (b,1)))

}