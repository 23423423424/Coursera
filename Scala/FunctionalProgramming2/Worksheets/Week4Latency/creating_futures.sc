package Week4Latency

import scala.concurrent.ExecutionContext.Implicits.global
import akka.serializer._

object creating_futures {
  val memory = Queue[EMailMessage](
    EMailMessage(from = "Erik", to = "Roland"),
    EMailMessage(from = "Martin", to = "Erik"),
    EMailMessage(from = "Roland", to = "Martin"))

  def readFromMemory(): Future[Array[Byte]] = Future {
    val email = queue.dequeue()
    val serializer = serialization.findSerializerFor(email)
    serializer.toBinary(email)
  }
}