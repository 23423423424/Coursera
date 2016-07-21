package forcomp

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(183); 
  def wordOccurrences(w: String) = w.toLowerCase.groupBy(element => element).map {
    case (char, string) => (char, string.length)
  }.toList.sorted;System.out.println("""wordOccurrences: (w: String)List[(Char, Int)]""");$skip(139); 

  /** Converts a sentence into its character occurrence list. */
  def sentenceOccurrences(s: List[String]) = wordOccurrences(s.mkString);System.out.println("""sentenceOccurrences: (s: List[String])List[(Char, Int)]""");$skip(31); 

  val w = List("a", "e", "t");System.out.println("""w  : List[String] = """ + $show(w ));$skip(33); 
  val x = sentenceOccurrences(w);System.out.println("""x  : List[(Char, Int)] = """ + $show(x ));$skip(45); 
  val dictionary = List("eat", "ate", "tea");System.out.println("""dictionary  : List[String] = """ + $show(dictionary ));$skip(49); 
  val temp = dictionary.groupBy(wordOccurrences);System.out.println("""temp  : scala.collection.immutable.Map[List[(Char, Int)],List[String]] = """ + $show(temp ));$skip(16); 
  println(temp);$skip(47); val res$0 = 

  temp.getOrElse(wordOccurrences("eat"), Nil);System.out.println("""res0: List[String] = """ + $show(res$0));$skip(33); 
  val z = wordOccurrences("eat");System.out.println("""z  : List[(Char, Int)] = """ + $show(z ));$skip(25); 

  var q = List(1, 2, 3);System.out.println("""q  : List[Int] = """ + $show(q ));$skip(13); 
  val q1 = 1;System.out.println("""q1  : Int = """ + $show(q1 ));$skip(29); 
  def double(x: Int) = x * 2;System.out.println("""double: (x: Int)Int""");$skip(60); 
  val sentence = List("Mary", "had", "a", "little", "lamb");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(99); val res$1 = 
  sentence.foldLeft("start")((a, b) => {
    println("[a:" + a + "][b:" + b + "]");
    a + b
  });System.out.println("""res1: String = """ + $show(res$1));$skip(62); 

  val sentence1 = List("Mary", "had", "a", "little", "lamb");System.out.println("""sentence1  : List[String] = """ + $show(sentence1 ));$skip(48); val res$2 = 
  sentence1.foldRight("start")((a, b) => a + b);System.out.println("""res2: String = """ + $show(res$2))}

}
