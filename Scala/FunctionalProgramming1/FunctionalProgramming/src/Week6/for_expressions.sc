package Week6

object for_expressions {
	case class Person(name: String, age: Int)
	
	for (p <- persons if p.age > 20) yield p.name
	//expression is equivalent to
	persons filter (p => p.age > 20) map (p => p.name)
	
}