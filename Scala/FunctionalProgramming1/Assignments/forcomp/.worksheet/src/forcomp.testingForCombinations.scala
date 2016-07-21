package forcomp

object testingForCombinations {
  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(359); 

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case x :: xs => (for {
        i <- 0 to x._2
        a <- combinations(xs)
      } yield if (i == 0) a else (x._1, i) :: a).toList
    }
  };System.out.println("""combinations: (occurrences: forcomp.testingForCombinations.Occurrences)List[forcomp.testingForCombinations.Occurrences]""");$skip(41); val res$0 = 
  combinations(List(('a', 1), ('b', 1)));System.out.println("""res0: List[forcomp.testingForCombinations.Occurrences] = """ + $show(res$0))}
}
