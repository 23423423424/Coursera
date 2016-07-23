package Week4ComposingFutures

object comprehensions {
  val socket = Socket()
  /**
   * val packet: Future[Array[Byte]] =
   * socket.readFromMemory()
   * val confirmation: Future[Array[Byte]] =
   * packet.flatMap(socket.sendToSafe(_))
   */
  val confirmation: Future[Array[Byte]] = for {
    packet <- socket.readFromMemory()
    confirmation <- socket.sendToSafe(packet)
  } yield confirmation

}