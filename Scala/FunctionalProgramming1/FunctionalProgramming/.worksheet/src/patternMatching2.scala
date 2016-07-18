
object patternMatching2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
	def eval(e) = e match{
		case Number(n) => n
		case Sum(e1,e2) => eval(e1) + eval(e2)
	};System.out.println("""eval: (e: <error>)Unit""")}
}
