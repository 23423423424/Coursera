package Week4ComposingFutures

object retryingSend {
  // sending packet resilant to failure
  def retry(noTimes: Int)(block: => Future[T]): Future[T] = {
    // retry successfully completing block at most noTimes
    // and give up after that
  }
  def retry(noTimes: Int)(block: => Future[T]): Future[T] = {
    if (noTimes == 0) {
      Future.failed(new Exception("Sorry"))
    } else {
      block fallbackTo {
        retry(noTimes - 1) { block }
      }
    }
  }

}