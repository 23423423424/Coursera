package Week6

object collections_implementations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(172); 
  val mnem = Map('2' -> "ABC", '3' -> "DEF", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ");System.out.println("""mnem  : scala.collection.immutable.Map[Char,String] = """ + $show(mnem ));$skip(114); 

  val charCode: Map[Char, Char] =
    for {
      (digit, str) <- mnem
      ltr <- str
    } yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(104); 
   def wordCode(word: String): String =
   	for{
   		ltr <- word.toUpperCase
   	} yield charCode(ltr);System.out.println("""wordCode: (word: String)String""");$skip(75); 
   def wordCode1(word: String): String =
   	word.toUpperCase map charCode;System.out.println("""wordCode1: (word: String)String""");$skip(25); val res$0 = 
   	
   wordCode("Java");System.out.println("""res0: String = """ + $show(res$0));$skip(21); val res$1 = 
   wordCode1("Java");System.out.println("""res1: String = """ + $show(res$1));$skip(55); 
   
   val wordsForNum: Map[String, Seq[String]] = ???;System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ))}
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
}
