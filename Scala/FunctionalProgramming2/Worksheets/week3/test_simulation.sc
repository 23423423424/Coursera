package week3

object test_simulation {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
  object sim extends Circuits with Parameters
  import sim._
  val in1, in2, sum, carry = new Wire             //> in1  : week3.test_simulation.sim.Wire = week3.Gates$Wire@53c8b26e
                                                  //| in2  : week3.test_simulation.sim.Wire = week3.Gates$Wire@1d3a7ebb
                                                  //| sum  : week3.test_simulation.sim.Wire = week3.Gates$Wire@6b5635fa
                                                  //| carry  : week3.test_simulation.sim.Wire = week3.Gates$Wire@68f1e723
  halfAdder(in1, in2, sum, carry)
  probe("sum", sum)                               //> sum 0 value = false
  probe("carry", carry)                           //> carry 0 value = false
  
  in1 setSignal true
  run()                                           //> *** sumulation started, time = 0 ***
  
  in2 setSignal true
  run()                                           //> *** sumulation started, time = 5 ***
  
  in1 setSignal false
  run()                                           //> *** sumulation started, time = 10 ***
  
}