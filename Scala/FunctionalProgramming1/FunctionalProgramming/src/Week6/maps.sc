package Week6

object maps {
	val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
	val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  capitalOfCountry("US")                          //> res0: String = Washington
  capitalOfCountry get "andorra"                  //> res1: Option[String] = None
  capitalOfCountry get "US"                       //> res2: Option[String] = Some(Washington)
  
  def showCapital(country: String) = capitalOfCountry.get(country) match {
  	case Some(capital) => capital
  	case None => "Missing data"
  }                                               //> showCapital: (country: String)String
  
  showCapital("US")                               //> res3: String = Washington
  showCapital("Andorra")                          //> res4: String = Missing data
  
  val fruit = List("apple", "pear", "orange", "pineapple")
                                                  //> fruit  : List[String] = List(apple, pear, orange, pineapple)
  fruit sortWith (_.length < _.length)            //> res5: List[String] = List(pear, apple, orange, pineapple)
  fruit.sorted                                    //> res6: List[String] = List(apple, orange, pear, pineapple)
  
  fruit groupBy (_.head)                          //> res7: scala.collection.immutable.Map[Char,List[String]] = Map(p -> List(pear
                                                  //| , pineapple), a -> List(apple), o -> List(orange))
  
  //x^3 -2x +5
  var z = Map(0 -> 5, 1 -> -2, 3 -> 1)            //> z  : scala.collection.immutable.Map[Int,Int] = Map(0 -> 5, 1 -> -2, 3 -> 1)
  
  
  
  
  
  
  
  
}