package Week6

object sets {
	val fruit = Set("apple","banana","pear")
	val s = (1 to 6).toSet
	s map (_ + 2)
	s.nonEmpty
}