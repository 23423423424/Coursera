package week1_ComputationsInParallel

object parallelConstruct {
  val (v1, v2) = parallel(e1, e2)
  //
  val t1 = task(e1)
  val t2 = task(e2)
  val v1 = t1.join
  val v2 = t2.join
  /**
   * task and join establish maps between computations and tasks
   * In terms of the value computed the equation task(e).join == e holds
   * We can omit writing.join if we also define an implicit conversion:
   */
  def task(c: => A): Task[A]
  trait Task[A] {
    def join: A
  }
  implicit def getJoin[T](x: Task[T]): T = x.join

}