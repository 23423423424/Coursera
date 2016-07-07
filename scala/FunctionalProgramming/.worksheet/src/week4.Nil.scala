package week4
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend(elem: T): List[T] = new Cons(elem, this)
}
class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false
}
object Nil extends List[Nothing] {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(296); 
  def isEmpty: Boolean = true;System.out.println("""isEmpty: => Boolean""");$skip(67); 
  def head: Nothing = throw new NoSuchElementException("Nil.head");System.out.println("""head: => Nothing""");$skip(67); 
  def tail: Nothing = throw new NoSuchElementException("Nil.tail");System.out.println("""tail: => Nothing""")}
}
object test{
	val x: List[String] = Nil
}
/**
object List{
	// List(1,2) = List.apply(1,2)
	def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
	def apply[T]() = new Nil
}
**/
