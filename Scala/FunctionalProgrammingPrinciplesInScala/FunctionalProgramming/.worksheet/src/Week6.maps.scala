package Week6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
	val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[String,Int] = """ + $show(romanNumerals ));$skip(75); 
	val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(25); val res$0 = 
  capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(33); val res$1 = 
  capitalOfCountry get "andorra";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(28); val res$2 = 
  capitalOfCountry get "US";System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(146); 
  
  def showCapital(country: String) = capitalOfCountry.get(country) match {
  	case Some(capital) => capital
  	case None => "Missing data"
  };System.out.println("""showCapital: (country: String)String""");$skip(23); val res$3 = 
  
  showCapital("US");System.out.println("""res3: String = """ + $show(res$3));$skip(25); val res$4 = 
  showCapital("Andorra");System.out.println("""res4: String = """ + $show(res$4));$skip(62); 
  
  val fruit = List("apple", "pear", "orange", "pineapple");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(39); val res$5 = 
  fruit sortWith (_.length < _.length);System.out.println("""res5: List[String] = """ + $show(res$5));$skip(15); val res$6 = 
  fruit.sorted;System.out.println("""res6: List[String] = """ + $show(res$6));$skip(28); val res$7 = 
  
  fruit groupBy (_.head);System.out.println("""res7: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$7));$skip(57); 
  
  //x^3 -2x +5
  var z = Map(0 -> 5, 1 -> -2, 3 -> 1);System.out.println("""z  : scala.collection.immutable.Map[Int,Int] = """ + $show(z ))}
  
  
  
  
  
  
  
  
}
