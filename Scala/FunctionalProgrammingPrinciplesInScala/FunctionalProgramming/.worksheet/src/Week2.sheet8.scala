package Week2

object sheet8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
	var x = new Ration(1,2);System.out.println("""x  : Week2.Ration = """ + $show(x ));$skip(26); val res$0 = 
	x.less1(new Ration(1,3));System.out.println("""res0: Week2.Ration = """ + $show(res$0));$skip(25); 
	var y = new Ration(1,3);System.out.println("""y  : Week2.Ration = """ + $show(y ));$skip(7); val res$1 = 
	x < y;System.out.println("""res1: Boolean = """ + $show(res$1))}
	
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
