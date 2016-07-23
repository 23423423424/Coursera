package Week1

object Monads {
	opt flatMap f flatMap g
	
	== opt match { case Some(x) => f(x) case None => None }
				match { case Some(y) => g(y) case None => None }
		
	== opt match {
		case Some(x) =>
			f(x) match { case Some(y) => g(y) case None => None }
			// f(x) flatMap g
		case None =>
			None
	
	// can inline nested expressions ass
	for (y <- for( x<- m; y <- f(x)) yield y
		z <- g(y)) yield z
		
	for(x <- m;
		y <- f(x)
		z <- g(y)) yield z
		
	// right unit law
	for (x <- m) yield x
	
	
		
		
		
			
}