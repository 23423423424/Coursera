package forcomp

object testing {
  def wordOccurrences(w: String) = w.toLowerCase.groupBy(element => element).map {
    case (char, string) => (char, string.length)
  }.toList.sorted                                 //> wordOccurrences: (w: String)List[(Char, Int)]

  /** Converts a sentence into its character occurrence list. */
  def sentenceOccurrences(s: List[String]) = wordOccurrences(s.mkString)
                                                  //> sentenceOccurrences: (s: List[String])List[(Char, Int)]

  val w = List("a", "e", "t")                     //> w  : List[String] = List(a, e, t)
  val x = sentenceOccurrences(w)                  //> x  : List[(Char, Int)] = List((a,1), (e,1), (t,1))
  val dictionary = List("eat", "ate", "tea")      //> dictionary  : List[String] = List(eat, ate, tea)
  val temp = dictionary.groupBy(wordOccurrences)  //> temp  : scala.collection.immutable.Map[List[(Char, Int)],List[String]] = Map
                                                  //| (List((a,1), (e,1), (t,1)) -> List(eat, ate, tea))
  println(temp)                                   //> Map(List((a,1), (e,1), (t,1)) -> List(eat, ate, tea))

  temp.getOrElse(wordOccurrences("eat"), Nil)     //> res0: List[String] = List(eat, ate, tea)
  val z = wordOccurrences("eat")                  //> z  : List[(Char, Int)] = List((a,1), (e,1), (t,1))

  var q = List(1, 2, 3)                           //> q  : List[Int] = List(1, 2, 3)
  val q1 = 1                                      //> q1  : Int = 1
  def double(x: Int) = x * 2                      //> double: (x: Int)Int
  val sentence = List("Mary", "had", "a", "little", "lamb")
                                                  //> sentence  : List[String] = List(Mary, had, a, little, lamb)
  sentence.foldLeft("start")((a, b) => {
    println("[a:" + a + "][b:" + b + "]");
    a + b
  })                                              //> [a:start][b:Mary]
                                                  //| [a:startMary][b:had]
                                                  //| [a:startMaryhad][b:a]
                                                  //| [a:startMaryhada][b:little]
                                                  //| [a:startMaryhadalittle][b:lamb]
                                                  //| res1: String = startMaryhadalittlelamb

  val sentence1 = List("Mary", "had", "a", "little", "lamb")
                                                  //> sentence1  : List[String] = List(Mary, had, a, little, lamb)
  sentence1.foldRight("start")((a, b) => a + b)   //> res2: String = Maryhadalittlelambstart

}