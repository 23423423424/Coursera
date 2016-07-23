package Week4CombinatorsOnFutures
// once asynchronous never block
object asynchronous {
	val socket = Socket()
	val packet: Future[Array[Byte]] =
		socket.readFromMemory()
	val confirmation: Future[Array[Byte]] =
		packet.flatMap(socket.sendToSafe(_))
	val c = Await.result(confirmation, 2 seconds)
	println(c.toText)
}