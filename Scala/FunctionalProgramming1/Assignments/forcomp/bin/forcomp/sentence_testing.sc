package forcomp
import forcomp._

object sentence_testing {
  val dictionaryPath = List("forcomp", "linuxwords.txt")
                                                  //> dictionaryPath  : List[String] = List(forcomp, linuxwords.txt)

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
  }                                               //> loadDictionary: => List[String]
  type Word = String
  type Sentence = List[Word]
  type Occurrences = List[(Char, Int)]

  val dictionary: List[Word] = loadDictionary     //> java.lang.RuntimeException: Could not load word list, dictionary file not fo
                                                  //| und
                                                  //| 	at scala.sys.package$.error(package.scala:27)
                                                  //| 	at forcomp.sentence_testing$$anonfun$main$1$$anonfun$2.apply(forcomp.sen
                                                  //| tence_testing.scala:13)
                                                  //| 	at forcomp.sentence_testing$$anonfun$main$1$$anonfun$2.apply(forcomp.sen
                                                  //| tence_testing.scala:13)
                                                  //| 	at scala.Option.getOrElse(Option.scala:121)
                                                  //| 	at forcomp.sentence_testing$$anonfun$main$1.loadDictionary$1(forcomp.sen
                                                  //| tence_testing.scala:12)
                                                  //| 	at forcomp.sentence_testing$$anonfun$main$1.apply$mcV$sp(forcomp.sentenc
                                                  //| e_testing.scala:30)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forcomp.sentence_testing$.main(forcomp.s
                                                  //| Output exceeds cutoff limit.

  def wordOccurrences(w: Word): Occurrences = w.toLowerCase.groupBy(element => element).map {
    case (char, string) => (char, string.length)
  }.toList.sorted

  def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString)

  lazy val dictionaryByOccurrences: Map[Occurrences, List[Word]] = dictionary.groupBy(wordOccurrences)

  def wordAnagrams(word: Word): List[Word] = dictionaryByOccurrences.getOrElse(wordOccurrences(word), Nil)

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case Nil => List(List())
      case head :: tail => (for {
        a <- combinations(tail)
        range <- 0 to head._2
      } yield if (range == 0) a else (head._1, range) :: a).toList
    }
  }

  def subtract(x: Occurrences, y: Occurrences): Occurrences = {
    val yMap = y.toMap withDefaultValue 0
    for {
      (char, int) <- x
      if (int - yMap(char) > 0)
    } yield (char, int - yMap(char))
  }

  def sentenceAnagrams(sentence: Sentence): List[Sentence] = {
    var x = sentenceOccurrences(sentence)
    List(Nil)
  }

  var x = List("Yes", "man")

  sentenceAnagrams(x)

}