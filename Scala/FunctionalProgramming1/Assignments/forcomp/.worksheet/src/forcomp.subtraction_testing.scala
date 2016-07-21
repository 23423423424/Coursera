package forcomp

object subtraction_testing {

  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 

  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1));System.out.println("""x  : List[(Char, Int)] = """ + $show(x ));$skip(25); 
  val y = List(('r', 1));System.out.println("""y  : List[(Char, Int)] = """ + $show(y ));$skip(191); 

  def subtract(x: Occurrences, y: Occurrences) = {
  	val yMap = y.toMap withDefaultValue 0
  	for{
  		(char,int) <- x
  		if (int - yMap(char) > 0)
  	} yield (char, int - yMap(char))
  };System.out.println("""subtract: (x: forcomp.subtraction_testing.Occurrences, y: forcomp.subtraction_testing.Occurrences)List[(Char, Int)]""");$skip(15); val res$0 = 
	subtract(x,y);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0))}
	
	
  
  
  
  
  
  
  
  
  

}
