package Week3

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  val t1 = new NonEmpty(7, new Empty, new Empty);System.out.println("""t1  : Week3.NonEmpty = """ + $show(t1 ));$skip(21); 
  var t2 = t1 incl 4;System.out.println("""t2  : Week3.IntSet = """ + $show(t2 ));$skip(16); 
	t2 = t2 incl 1;$skip(17); 
	t2 = t2 incl 10}
	

}

// possible to redefine abstract definitions in a
// subclass have to use override

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
  def union(other: IntSet): IntSet = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + elem + right + "}"

  def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}
