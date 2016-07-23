package Week1

object function1_implementation {
  val f: String => String = {
    case "ping" => "pong"
    case _      => "Unknown"
  }                                               //> f  : String => String = <function1>
  f("ping")                                       //> res0: String = pong
  f("abc")                                        //> res1: String = Unknown

  val f1: PartialFunction[String, String] = {
    case "ping" => "pong"
  }                                               //> f1  : PartialFunction[String,String] = <function1>
  f1.isDefinedAt("ping")                          //> res2: Boolean = true
  f1.isDefinedAt("pong")                          //> res3: Boolean = false
  f1("ping")                                      //> res4: String = pong

  val f2: PartialFunction[List[Int], String] = {
    case Nil            => "one"
    case x :: y :: rest => "two"
  }                                               //> f2  : PartialFunction[List[Int],String] = <function1>

  f2.isDefinedAt(List(1, 2, 3))                   //> res5: Boolean = true
  f2(List(1,2,3))                                 //> res6: String = two

	val g: PartialFunction[List[Int], String] = {
		case Nil => "one"
		case x :: rest =>
			rest match {
				case Nil => "two"
				case _ => "Unknown"
			}
	}                                         //> g  : PartialFunction[List[Int],String] = <function1>
	
	g.isDefinedAt(List(1,2,3))                //> res7: Boolean = true
	g(List(1,2,3))                            //> res8: String = Unknown





}