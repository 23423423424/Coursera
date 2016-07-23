package Week4CombinatorsOnFutures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.imaginary.Http._

object sendingPacketsUnderFutures{

}

object Http {

  def apply(url: URL, req: Request): Future[Response] =
    { _ runs the http request asynchronously _ }
    
  def sendToEurope(packet: Array[Byte]): Future[Array[Byte]] =
    Http(URL("mail.server.eu"), Request(packet))
      .filter(response => response.isOK)
      .map(response => response.toByteArray)
      
  // sending packets using futures robustly
  
  def sendTo(url: URL, packet: Array[Byte]): Future[Array[Byte]] =
    Http(url, Request(packet))
      .filter(response => response.isOK)
      .map(response => response.toByteArray)
      
  def sendToAndBackup(packet: Array[Byte]):
 		Future[(Array[Byte] Array[Byte])] = {
  		val europeConfirm = sendTo(mailServer.europe, packet)
  		val usaConfirm = sendTo(mailServer.usa, packet)
  		europeConfirm.zip(usaConfirm)
  	}
  	
  def recover(f: PartialFunction[Throwable, T]): Future[T]
  
  def recoverWith(f: PartialFunction[Throwable, Future[T]]): Future[T]
  
  def sendToSafe(packet: Array[Byte]): Future[Array[Byte]] =
  	sendTo(mailServer.europe, packet) recoverWith {
  		case europeError => sendTo(mailServer.usa, packet) recover {
  			case usaError => usaError.getMessage.toByteArray
  		}
  	}
  	
}