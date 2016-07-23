package Week4ComposingFutures

object implementationOfFlatMap {
	trait Future[T]{
		def onComplete(callback: Try[T] => Unit) = ...
		def flatMap[S](f: T => Future[S]): Future[S] = ???
	}
	
	trait Future[T] {
		self =>
		def flatMap[S](f: T => Future[S]): Future[S] =
			new Future[S] {
				def onComplete(callback: Try[S] => Unit): Unit =
					self onComplete {
						case Success(x) => f(x).onComplete(callback)
						case Failure(x) => callback(Failure(e))
					}
			}
	}
	
}