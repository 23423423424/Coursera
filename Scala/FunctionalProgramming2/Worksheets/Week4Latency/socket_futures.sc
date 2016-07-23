package Week4Latency

object socket_futures {
  trait Future[T] {
    def onComplete(callback: Try[T] => Unit): Unit
  }
  trait Socket {
    def readFromMemory(): Future[Array[Byte]]
    def sendToEurope(packet: Array[Byte]): Future[Array[Byte]]
  }
  // sending packets using futures
  val socket = Socket()
  val packet: Future[Array[Byte]] =
    socket.readFromMemory()

  val confirmation: Future[Array[Byte]] =
    packet.onComplete {

      case Success(p) => socket.sendToEurope(p)
      //  case Success(p) => {
      //	val confirmation: Future[Array[Byte]] = socket.sendToEurope
      //}
      case Failure(t) =>
    }

}