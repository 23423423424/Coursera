package Week6

object for_expressions {
	case class Person(name: String, age: Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(131); val res$0 = 
	
	for (p <- persons if p.age > 20) yield p.name;System.out.println("""res0: <error> = """ + $show(res$0));$skip(83); val res$1 = 
	//expression is equivalent to
	persons filter (p => p.age > 20) map (p => p.name);System.out.println("""res1: <error> = """ + $show(res$1))}
	
}
