package Week4Latency

object constructing_futures {
	object Future{
		def apply(body: => T): Future[T]
	}
}