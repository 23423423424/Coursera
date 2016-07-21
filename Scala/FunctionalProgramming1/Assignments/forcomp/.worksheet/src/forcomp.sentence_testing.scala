package forcomp
import forcomp._

object sentence_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
  val dictionaryPath = List("forcomp", "linuxwords.txt");System.out.println("""dictionaryPath  : List[String] = """ + $show(dictionaryPath ));$skip(528); 

  def loadDictionary = {
    val wordstream = Option {
      getClass.getResourceAsStream(dictionaryPath.mkString("/"))
    } orElse {
      common.resourceAsStreamFromSrc(dictionaryPath)
    } getOrElse {
      sys.error("Could not load word list, dictionary file not found")
    }
    try {
      val s = io.Source.fromInputStream(wordstream)
      s.getLines.toList
    } catch {
      case e: Exception =>
        println("Could not load word list: " + e)
        throw e
    } finally {
      wordstream.close()
    }
  }
  type Word = String
  type Sentence = List[Word]
  type Occurrences = List[(Char, Int)];System.out.println("""loadDictionary: => List[String]""");$skip(136); 

  val dictionary: List[Word] = loadDictionary;System.out.println("""dictionary  : List[forcomp.sentence_testing.Word] = """ + $show(dictionary ));$skip(162); 

  def wordOccurrences(w: Word): Occurrences = w.toLowerCase.groupBy(element => element).map {
    case (char, string) => (char, string.length)
  }.toList.sorted;System.out.println("""wordOccurrences: (w: forcomp.sentence_testing.Word)forcomp.sentence_testing.Occurrences""");$skip(83); 

  def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString);System.out.println("""sentenceOccurrences: (s: forcomp.sentence_testing.Sentence)forcomp.sentence_testing.Occurrences""");$skip(104); 

  lazy val dictionaryByOccurrences: Map[Occurrences, List[Word]] = dictionary.groupBy(wordOccurrences);System.out.println("""dictionaryByOccurrences: => Map[forcomp.sentence_testing.Occurrences,List[forcomp.sentence_testing.Word]]""");$skip(108); 

  def wordAnagrams(word: Word): List[Word] = dictionaryByOccurrences.getOrElse(wordOccurrences(word), Nil);System.out.println("""wordAnagrams: (word: forcomp.sentence_testing.Word)List[forcomp.sentence_testing.Word]""");$skip(297); 

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case head :: tail => (for {
        a <- combinations(tail)
        range <- 0 to head._2
      } yield if (range == 0) a else (head._1, range) :: a).toList
    }
  };System.out.println("""combinations: (occurrences: forcomp.sentence_testing.Occurrences)List[forcomp.sentence_testing.Occurrences]""");$skip(213); 

  def subtract(x: Occurrences, y: Occurrences): Occurrences = {
    val yMap = y.toMap withDefaultValue 0
    for {
      (char, int) <- x
      if (int - yMap(char) > 0)
    } yield (char, int - yMap(char))
  };System.out.println("""subtract: (x: forcomp.sentence_testing.Occurrences, y: forcomp.sentence_testing.Occurrences)forcomp.sentence_testing.Occurrences""");$skip(124); 

  def sentenceAnagrams(sentence: Sentence): List[Sentence] = {
    var x = sentenceOccurrences(sentence)
    List(Nil)
  };System.out.println("""sentenceAnagrams: (sentence: forcomp.sentence_testing.Sentence)List[forcomp.sentence_testing.Sentence]""");$skip(30); 

  var x = List("Yes", "man");System.out.println("""x  : List[String] = """ + $show(x ));$skip(23); val res$0 = 

  sentenceAnagrams(x);System.out.println("""res0: List[forcomp.sentence_testing.Sentence] = """ + $show(res$0))}

}
