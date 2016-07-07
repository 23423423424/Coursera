package funsets

object sheet1 {
  /**
   * We represent a set by its characte
   * its `contains` predicate.
   */
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: funsets.sheet1.Set, elem: Int)Boolean

  contains(x => true, 100)                        //> res0: Boolean = true
  contains(x => true, -100)                       //> res1: Boolean = true

  def singletonSet(elem: Int): Set =
    x => x == elem                                //> singletonSet: (elem: Int)funsets.sheet1.Set

  2 == 2                                          //> res2: Boolean(true) = true
  var x1 = Set(2 == 2)                            //> x1  : scala.collection.immutable.Set[Boolean] = Set(true)
  println(x1)                                     //> Set(true)

  var x = singletonSet(5)                         //> x  : funsets.sheet1.Set = <function1>

  contains(x, 2)                                  //> res3: Boolean = false

  var y = singletonSet(10)                        //> y  : funsets.sheet1.Set = <function1>
  println(y)                                      //> <function1>

  def union(s: Set, t: Set): Set = x => s(x) || t(x)
                                                  //> union: (s: funsets.sheet1.Set, t: funsets.sheet1.Set)funsets.sheet1.Set

  var k = union(x, y)                             //> k  : funsets.sheet1.Set = <function1>
  println(k)                                      //> <function1>

  contains(k, 5)                                  //> res4: Boolean = true
  contains(k, 10)                                 //> res5: Boolean = true
  contains(k, 1)                                  //> res6: Boolean = false

  val f: Function1[Int, String] = myInt => "my int: " + myInt.toString
                                                  //> f  : Int => String = <function1>
  f(0)                                            //> res7: String = my int: 0

  def intersect(s: Set, t: Set): Set =
    x => s(x) && t(x)                             //> intersect: (s: funsets.sheet1.Set, t: funsets.sheet1.Set)funsets.sheet1.Set

  var x2 = Set(1, 2, 3)                           //> x2  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  var x3 = Set(2, 3, 4)                           //> x3  : scala.collection.immutable.Set[Int] = Set(2, 3, 4)
  var x4 = intersect(x2, x3)                      //> x4  : funsets.sheet1.Set = <function1>
  contains(x4, 1)                                 //> res8: Boolean = false
  contains(x4, 2)                                 //> res9: Boolean = true
  contains(x4, 3)                                 //> res10: Boolean = true
  contains(x4, 4)                                 //> res11: Boolean = false

	var bound = 1000                          //> bound  : Int = 1000
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (contains(s, a) && !p(a)) false
      else iter(a + 1)
    }
    iter(-bound)
  }                                               //> forall: (s: funsets.sheet1.Set, p: Int => Boolean)Boolean
  var s1 = Set(1,2,3,4)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  def five(x: Int): Boolean = x < 5               //> five: (x: Int)Boolean
  five(2)                                         //> res12: Boolean = true
  var b = forall(s1, x => five(x))                //> b  : Boolean = true






















}