
object patternMatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(128); 
	
	def eval(e: Expr): Int = e match{
		case Number(n) => n
		case Sum(e1,e2) => eval(e1) + eval(e2)
	};System.out.println("""eval: (e: Expr)Int""");$skip(35); val res$0 = 
	
	eval(Sum(Number(1), Number(2)));System.out.println("""res0: <error> = """ + $show(res$0));$skip(123); 
	
	def show(e: Expr): String = e match{
		case Number(n) => n.toString
		case Sum(e1,e2) => show(e1) + " + " + show(e2)
	};System.out.println("""show: (e: Expr)String""");$skip(19); val res$1 = 
	
	show(Number(2));System.out.println("""res1: <error> = """ + $show(res$1));$skip(34); val res$2 = 
	show(Sum(Number(1), Number(44)));System.out.println("""res2: <error> = """ + $show(res$2))}
	
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
