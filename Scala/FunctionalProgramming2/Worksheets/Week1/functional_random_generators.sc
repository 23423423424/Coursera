package Week1

import java.util.Random

trait Generator[+T] {
  self => // an alias for this
  def generate: T

  def map[S](f: T => S): Generator[S] = new Generator[S] {
    def generate = f(self.generate)
  }
  def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S] {
    def generate = f(self.generate).generate
  }
}

object functional_random_generators {

  val integers = new Generator[Int] {
    val rand = new java.util.Random
    def generate = rand.nextInt()
  }
  val booleans = new Generator[Boolean] {
    def generate = integers.generate > 0
  }
  val booleans2 = integers.map(_ >= 0)
  val pairs = new Generator[(Int, Int)] {
    def generate = (integers.generate, integers.generate)
  }

  val booleans1 = for (x <- integers) yield x > 0

  def pairs[T, U](t: Generator[T], u: Generator[U]) = for {
    x <- t
    y <- u
  } yield (x, y)

  /**
   * def pairs[T, U](t: Generator[T], u: Generator[U]) = t flatMap {
   * x => u map { y => (x,y) }
   * }
   *
   * def pairs[T, U](t: Generator[T], u: Generator[U]) = t flatMap {
   * x => new Generator[(T,U)} { def generate = (x, u.generate) }}
   *
   * def pairs[T, U](t: Generator[T], u: Generator[U]) = new Generator[(T,U)] {
   * def generate = (new Generator[(T,U)] {
   * def generate = (t.generate, u.generate)
   * }).generate }
   *
   * def pairs[T,U](t: Generator[T], u: Generator[U]) = new Generator[(T,U)] {
   * def generate = (t.generate, u.generate)
   * }
   */

  def single[T](x: T): Generator[T] = new Generator[T] {
    def generate = x
  }

  def choose(lo: Int, hi: Int): Generator[Int] =
    for (x <- integers) yield lo + x % (hi - lo)

  def oneOf[T](xs: T*): Generator[T] =
    for (idx <- choose(0, xs.length)) yield xs(idx)

  def lists: Generator[List[Int]] = for {
    isEmpty <- booleans
    list <- if (isEmpty) emptyLists else nonEmptyLists
  } yield list

  def emptyLists = single(Nil)
  def nonEmptyLists = for {
    head <- integers
    tail <- lists
  } yield head :: tail

  trait Tree
  case class Inner(left: Tree, right: Tree) extends Tree
  case class Leaf(x: Int) extends Tree

  def leafs: Generator[Leaf] = for {
    x <- integers
  } yield Leaf(x)

  def inners: Generator[Inner] = for {
    l <- trees
    r <- trees
  } yield Inner(l, r)

  def trees: Generator[Tree] = for {
    isLeaf <- booleans
    tree <- if (isLeaf) leafs else inners
  } yield tree
  
  

}