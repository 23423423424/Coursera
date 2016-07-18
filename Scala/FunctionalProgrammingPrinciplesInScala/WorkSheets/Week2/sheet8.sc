package Week2

object sheet8 {
	var x = new Ration(1,2)                   //> x  : Week2.Ration = 1/2
	x.less1(new Ration(1,3))                  //> res0: Week2.Ration = 1/3
	var y = new Ration(1,3)                   //> y  : Week2.Ration = 1/3
	x < y                                     //> res1: Boolean = false
	
}

class Ration(x: Int, y: Int){
	def numer = x
	def denom = y
	def less(that: Ration) = this.numer * that.denom < that.numer * this.denom
	def less1(that: Ration) =
		if (this.numer * that.denom < that.numer * this.denom) this
		else that
	def < (that: Ration) = this.numer * that.denom < that.numer * this.denom
	override def toString = {
  	numer + "/" + denom
  }
}