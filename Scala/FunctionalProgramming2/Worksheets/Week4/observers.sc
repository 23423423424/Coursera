package Week4

object observers {
  val a, b = new BankAccount                      //> a  : Week4.BankAccount = Week4.BankAccount@10fd9d27
                                                  //| b  : Week4.BankAccount = Week4.BankAccount@e1b7e37
  val c = new Consolidator(List(a, b))            //> c  : Week4.Consolidator = Week4.Consolidator@70419e13
  c.totalBalance                                  //> res0: Int = 0
  a deposit 20
  c.totalBalance                                  //> res1: Int = 20
  b deposit 30
  c.totalBalance                                  //> res2: Int = 50
}