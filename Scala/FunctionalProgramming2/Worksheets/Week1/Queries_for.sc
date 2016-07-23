package Week1

object Queries_for {
  case class Book(title: String, authors: List[String])
  val books = Set(
    Book(title = "Structure and Interpretation of Computer Programs",
      authors = List("Abelson, Harald", "Sussman, Gerald J.")),
    Book(title = "Introduction to Functional Programming",
      authors = List("Bird, Richard")),
    Book(title = "Introduction to Functional Programming Principles",
      authors = List("Bird, Richard")))

  for (b <- books; a <- b.authors if a startsWith "Bird,") yield b.title

  for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1

	// translation of for to high order functions
	books flatMap( b => for(a <- b.authors withFilter (a => a startsWith "Bird")) yield b.title)
  //books flatMap(b => b.authors withFilter ( a => a startsWith "Bird") map ( a => a.title))
  

}