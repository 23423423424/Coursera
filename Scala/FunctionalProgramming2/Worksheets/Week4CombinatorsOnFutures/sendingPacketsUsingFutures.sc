package Week4CombinatorsOnFutures

object sendingPacketsUsingFutures {
  val socket = Socket()
  val packet: Future[Array[Byte]] =
    socket.readFromMemory()
  /**
   * packet onComplete {
   * case Success(p) => {
   * val confirmation: Future[Array[Byte]] =
   * socket.sendToEurope(p)
   * }
   * case Failure(t) =>
   * }
   */
  val confirmation: Future[Array[Byte]] =
    packet.flatMap(p => socket.sendToEurope(p))
}