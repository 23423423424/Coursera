package Week4CombinatorsOnFutures

object recovery {

  def recover(f: PartialFunction[Throwable, T]): Future[T]
  
  def recoverWith(f: PartialFunction[Throwable, Future[T]]): Future[T]
  
  def sendToSafe(packet: Array[Byte]): Future[Array[Byte]] =
    sendTo(mailServer.europe, packet) recoverWith {
      case europeError => sendTo(mailServer.usa, packet) recover {
        case usaError => usaError.getMessage.toByteArray
      }
    }
    
   def fallbackTo1(that: => Future[T]): Future[T] = {
   	// if this future fails take the successful result of that future
   	// if that future fails too, take the error of this future
   }
   
   def sendToSafe(packet: Array[Byte]): Future[Array[Byte]] =
   	sendTo(mailServer.europe, packet) fallbackTo{
   		sendTo(mailServer.usa, packet)
   	} recover {
   		case europeError => europeError.getMessage.toByteArray
   	}
   	
	def fallbackTo(that: => Future[T]): Future[T] = {
		this recoverWith {
			case _ => that recoverWith { case _ => this }
		}
	}
	
	

}