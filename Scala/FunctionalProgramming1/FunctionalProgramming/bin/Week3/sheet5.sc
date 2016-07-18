import Week3.Rational
//import Week3._ imports everything that is defined in the package
//import Week3.{Rational, Hello} imports both Rational and Hello

object sheet5 {
  new Rational(1, 2)                              //> res0: Week3.Rational = 1/2

  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  //error("test")

  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null
  //val z: Int = x

  def boolean_testing(x: Int) =
    if (x == 1) true
    else false                                    //> boolean_testing: (x: Int)Boolean

  boolean_testing(1)                              //> res1: Boolean = true

  if (true) 1 else false                          //> res2: AnyVal = 1

}