package Week6

object collections_implementations {
  val mnem = Map('2' -> "ABC", '3' -> "DEF", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")
                                                  //> mnem  : scala.collection.immutable.Map[Char,String] = Map(8 -> TUV, 9 -> WXY
                                                  //| Z, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)

  val charCode: Map[Char, Char] =
    for {
      (digit, str) <- mnem
      ltr <- str
    } yield ltr -> digit                          //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, V -> 8, Q -> 7, L -> 5, B -> 2, P -> 7,
                                                  //|  C -> 2, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -> 9, S -> 7)
   def wordCode(word: String): String =
   	for{
   		ltr <- word.toUpperCase
   	} yield charCode(ltr)                     //> wordCode: (word: String)String
   def wordCode1(word: String): String =
   	word.toUpperCase map charCode             //> wordCode1: (word: String)String
   	
   wordCode("Java")                               //> res0: String = 5282
   wordCode1("Java")                              //> res1: String = 5282
   
   val wordsForNum: Map[String, Seq[String]] = ???//> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:230)
                                                  //| 	at Week6.collections_implementations$$anonfun$main$1.apply$mcV$sp(Week6.
                                                  //| collections_implementations.scala:22)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Week6.collections_implementations$.main(Week6.collections_implementat
                                                  //| ions.scala:3)
                                                  //| 	at Week6.collections_implementations.main(Week6.collections_implementati
                                                  //| ons.scala)
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
}