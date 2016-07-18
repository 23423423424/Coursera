package week5

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
	val pair = ("answer",42);System.out.println("""pair  : (String, Int) = """ + $show(pair ));$skip(27); 
	val (label, value) = pair;System.out.println("""label  : String = """ + $show(label ));System.out.println("""value  : Int = """ + $show(value ));$skip(22); 
	val label1 = pair._1;System.out.println("""label1  : String = """ + $show(label1 ));$skip(22); 
	val value1 = pair._2;System.out.println("""value1  : Int = """ + $show(value1 ));$skip(17); 
	println(label1);$skip(17); 
	println(value1)}
}
/**
case class Tuple2[T1, T2](_1: +T1, _2: +T2) {
	override def toString = "(" + _1 + "," + _2 +")"
}
**/
