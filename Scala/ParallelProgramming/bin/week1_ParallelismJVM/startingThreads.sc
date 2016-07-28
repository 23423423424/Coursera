class HelloThread extends Thread {
  override def run() {
    println("Hello")
    println(" world")
  }
}

object startingThreads {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t = new HelloThread()                       //> t  : week1.HelloThread = Thread[Thread-0,5,main]
  val s = new HelloThread()                       //> s  : week1.HelloThread = Thread[Thread-1,5,main]
  t.start()
  s.start()
  
  t.join()                                        //> Hello
                                                  //| Hello
                                                  //|  world
                                                  //|  world
  s.join()
  
}