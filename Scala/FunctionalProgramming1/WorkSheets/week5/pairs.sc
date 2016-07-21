package week5

object pairs {
	val pair = ("answer",42)                  //> pair  : (String, Int) = (answer,42)
	val (label, value) = pair                 //> label  : String = answer
                                                  //| value  : Int = 42
	val label1 = pair._1                      //> label1  : String = answer
	val value1 = pair._2                      //> value1  : Int = 42
	println(label1)                           //> answer
	println(value1)                           //> 42
}
/**
case class Tuple2[T1, T2](_1: +T1, _2: +T2) {
	override def toString = "(" + _1 + "," + _2 +")"
}
**/