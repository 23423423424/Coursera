package Week4Latency

object socket_implementation {
	trait Socket{
		def readFromMemory(): Array[Byte]
		def sendToEurope(packet: Array[Byte]): Array[Byte]
	}
	val socket = Socket()
	val packet = socket.readFromMemory()
	val confirmation = socket.sendToEurope(packet)
}