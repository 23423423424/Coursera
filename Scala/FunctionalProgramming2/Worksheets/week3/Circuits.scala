package week3

abstract class Circuits extends Gates {
  
  def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire){
    val d, e = new Wire
    orGate(a,b,d)
    andGate(a,b,c)
    inverter(c,e)
    andGate(d,e,s)
  }
  
  def fullAdder(a: Wire, b: Wire, cin: Wire, sum: Wire, cout: Wire){
    val s, c1, c2 = new Wire
    halfAdder(a, cin, s, c1)
    halfAdder(b, s, sum, c2)
    orGate(c1, c2, cout)
  }
  
}