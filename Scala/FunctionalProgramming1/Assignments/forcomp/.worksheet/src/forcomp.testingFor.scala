package forcomp

object testingFor {

  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(436); 

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
  };System.out.println("""combinations: (occurrences: forcomp.testingFor.Occurrences)List[forcomp.testingFor.Occurrences]""");$skip(45); val res$0 = 
  

  combinations(List(('a', 1), ('b', 1)));System.out.println("""res0: List[forcomp.testingFor.Occurrences] = """ + $show(res$0))}

}
