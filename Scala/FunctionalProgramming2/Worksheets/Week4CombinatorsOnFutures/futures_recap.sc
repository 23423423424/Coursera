package Week4CombinatorsOnFutures

object futures_recap {
  trait Awaitable[T] extends AnyRef {
    abstract def ready(atMost: Duration): Unit
    abstract def result(atMost: Duration): T
  }
  trait Future[T] extends Awaitable[T]{
  	def filter(p: T=>Boolean): Future[T]
  	def flatMap[S](f: T=>Future[S]): Future[U]
  	def map[S](f: T=>S): Future[S]
  	def recoverWith(f: PartialFunction[Throwable, Future[T]]): Future[T]
  }
  object Future{
  	def apply[T](body: =>T): Future[T]
  }
}