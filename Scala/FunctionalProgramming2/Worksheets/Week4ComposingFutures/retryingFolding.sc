package Week4ComposingFutures

object retryingFolding {
  /**
   * List(a,b,c).foldRight(e)(f)
   * f(a, f(b, f(c, e)))
   * List(a,b,c).foldLeft(e)(f)
   * f(f(f(e,a),b),c)
   */
   // retry using foldLeft
	def retry(noTimes: Int)(block: => Future[T]): Future[T] = {
		val ns = (1 to noTimes).toList
		val attempts = ns.map(_ => () => block)
		val failed = Future.failed(new Exception("boom"))
		val result = attempts.foldLeft(failed)
			((a,block) => a recoverWith { block() })
		result
		
	// retry using foldRight
	def retry(noTimes: Int)(block: => Future[T]): Future[T] = {
		val ns = (1 to noTimes).toList
		val attempts = ns.map(_ => () => block)
		val failed = Future.failed(new Exception)
		val result = attempts.foldRight(() => failed)
			((block, a) => () => { block() fallbackTo { a () } })
		result ()
	}
	 
	
	
	
	
	
	
	
	
	
	
}