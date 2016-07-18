
object patternMatching {
	
	def eval(e: Expr): Int = e match{
		case Number(n) => n
		case Sum(e1,e2) => eval(e1) + eval(e2)
	}                                         //> eval: (e: Expr)Int
	
	eval(Sum(Number(1), Number(2)))           //> res0: <error> = 3
	
	def show(e: Expr): String = e match{
		case Number(n) => n.toString
		case Sum(e1,e2) => show(e1) + " + " + show(e2)
	}                                         //> show: (e: Expr)String
	
	show(Number(2))                           //> res1: <error> = 2
	show(Sum(Number(1), Number(44)))          //> res2: <error> = 1 + 44
	
}

trait Expr
case class Number(n: Int) extends Expr
/***
	object Number {
		def apply(n: Int) = new Number(n)
	}
***/
case class Sum(e1: Expr, e2: Expr) extends Expr
/***
	object Sum {
		def apply(e1: Expr, e2: Expr) = new Sum(e1, e2)
	}
***/