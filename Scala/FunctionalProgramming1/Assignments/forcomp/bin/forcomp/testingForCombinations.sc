package forcomp

object testingForCombinations {
  type Occurrences = List[(Char, Int)]

  val q = (for {
    i <- 0 to 1
    j <- 0 to 1
  } yield i + "-> " + j + " => ").toList          //> q  : List[String] = List("0-> 0 => ", "0-> 1 => ", "1-> 0 => ", "1-> 1 => ")
                                                  //| 

  println(q)                                      //> List(0-> 0 => , 0-> 1 => , 1-> 0 => , 1-> 1 => )

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case head :: tail => (for {
        a <- combinations(tail)
        range <- 0 to head._2
      } yield if (range == 0) a else (head._1, range) :: a).toList
    }
  }                                               //> combinations: (occurrences: forcomp.testingForCombinations.Occurrences)List[
                                                  //| forcomp.testingForCombinations.Occurrences]
  val results = combinations(List(('a', 2), ('b', 1)))
                                                  //> results  : List[forcomp.testingForCombinations.Occurrences] = List(List(), L
                                                  //| ist((a,1)), List((a,2)), List((b,1)), List((a,1), (b,1)), List((a,2), (b,1))
                                                  //| )
  println(results.length)                         //> 6
  println(results)                                //> List(List(), List((a,1)), List((a,2)), List((b,1)), List((a,1), (b,1)), List
                                                  //| ((a,2), (b,1)))

}