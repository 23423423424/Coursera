package forcomp

object testingForCombinations {
  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(178); 

  val q = (for {
    i <- 0 to 1
    j <- 0 to 1
  } yield i + "-> " + j + " => ").toList;System.out.println("""q  : List[String] = """ + $show(q ));$skip(14); 

  println(q);$skip(297); 

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case head :: tail => (for {
        a <- combinations(tail)
        range <- 0 to head._2
      } yield if (range == 0) a else (head._1, range) :: a).toList
    }
  };System.out.println("""combinations: (occurrences: forcomp.testingForCombinations.Occurrences)List[forcomp.testingForCombinations.Occurrences]""");$skip(55); 
  val results = combinations(List(('a', 2), ('b', 1)));System.out.println("""results  : List[forcomp.testingForCombinations.Occurrences] = """ + $show(results ));$skip(26); 
  println(results.length);$skip(19); 
  println(results)}

}
