package forcomp

object subtraction_testing {

  type Occurrences = List[(Char, Int)]

  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> x  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
  val y = List(('r', 1))                          //> y  : List[(Char, Int)] = List((r,1))

  def subtract(x: Occurrences, y: Occurrences) = {
  	val yMap = y.toMap withDefaultValue 0
  	for{
  		(char,int) <- x
  		if (int - yMap(char) > 0)
  	} yield (char, int - yMap(char))
  }                                               //> subtract: (x: forcomp.subtraction_testing.Occurrences, y: forcomp.subtractio
                                                  //| n_testing.Occurrences)List[(Char, Int)]
	subtract(x,y)                             //> res0: List[(Char, Int)] = List((a,1), (d,1), (l,1))
	
	
  
  
  
  
  
  
  
  
  

}