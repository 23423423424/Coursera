package funsets

object sheet1 {
  /**
   * We represent a set by its characte
   * its `contains` predicate.
   */
  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(264); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: funsets.sheet1.Set, elem: Int)Boolean""");$skip(28); val res$0 = 

  contains(x => true, 100);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(28); val res$1 = 
  contains(x => true, -100);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(57); 

  def singletonSet(elem: Int): Set =
    x => x == elem;System.out.println("""singletonSet: (elem: Int)funsets.sheet1.Set""");$skip(10); val res$2 = 

  2 == 2;System.out.println("""res2: Boolean(true) = """ + $show(res$2));$skip(23); 
  var x1 = Set(2 == 2);System.out.println("""x1  : scala.collection.immutable.Set[Boolean] = """ + $show(x1 ));$skip(14); 
  println(x1);$skip(27); 

  var x = singletonSet(5);System.out.println("""x  : funsets.sheet1.Set = """ + $show(x ));$skip(18); val res$3 = 

  contains(x, 2);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(28); 

  var y = singletonSet(10);System.out.println("""y  : funsets.sheet1.Set = """ + $show(y ));$skip(13); 
  println(y);$skip(54); 

  def union(s: Set, t: Set): Set = x => s(x) || t(x);System.out.println("""union: (s: funsets.sheet1.Set, t: funsets.sheet1.Set)funsets.sheet1.Set""");$skip(23); 

  var k = union(x, y);System.out.println("""k  : funsets.sheet1.Set = """ + $show(k ));$skip(13); 
  println(k);$skip(18); val res$4 = 

  contains(k, 5);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(18); val res$5 = 
  contains(k, 10);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(17); val res$6 = 
  contains(k, 1);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(72); 

  val f: Function1[Int, String] = myInt => "my int: " + myInt.toString;System.out.println("""f  : Int => String = """ + $show(f ));$skip(7); val res$7 = 
  f(0);System.out.println("""res7: String = """ + $show(res$7));$skip(62); 

  def intersect(s: Set, t: Set): Set =
    x => s(x) && t(x);System.out.println("""intersect: (s: funsets.sheet1.Set, t: funsets.sheet1.Set)funsets.sheet1.Set""");$skip(25); 

  var x2 = Set(1, 2, 3);System.out.println("""x2  : scala.collection.immutable.Set[Int] = """ + $show(x2 ));$skip(24); 
  var x3 = Set(2, 3, 4);System.out.println("""x3  : scala.collection.immutable.Set[Int] = """ + $show(x3 ));$skip(29); 
  var x4 = intersect(x2, x3);System.out.println("""x4  : funsets.sheet1.Set = """ + $show(x4 ));$skip(18); val res$8 = 
  contains(x4, 1);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(18); val res$9 = 
  contains(x4, 2);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(18); val res$10 = 
  contains(x4, 3);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(18); val res$11 = 
  contains(x4, 4);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(19); 

	var bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(209); 
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (contains(s, a) && !p(a)) false
      else iter(a + 1)
    }
    iter(-bound)
  };System.out.println("""forall: (s: funsets.sheet1.Set, p: Int => Boolean)Boolean""");$skip(24); 
  var s1 = Set(1,2,3,4);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(36); 
  def five(x: Int): Boolean = x < 5;System.out.println("""five: (x: Int)Boolean""");$skip(10); val res$12 = 
  five(2);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(35); 
  var b = forall(s1, x => five(x));System.out.println("""b  : Boolean = """ + $show(b ))}






















}
