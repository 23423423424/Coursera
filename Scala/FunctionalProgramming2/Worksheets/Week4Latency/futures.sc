package Week4Latency
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

object futures {
  trait Future[T] {
  	def onComplete(success: T => Unit, failed: Throwable => Unit): Unit
    def onComplete(callback: Observer[T]): Unit
  }
  trait Observer[T]{
  	def onNext(value: T): Unit
  	def onError(error: Throwable): Unit
  }
}