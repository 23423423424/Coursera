package week3

object bank_account {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val acct = new BankAccount                      //> acct  : week3.BankAccount = week3.BankAccount@1c47cf34
  acct deposit 10
  acct withdraw 5                                 //> res0: Int = 5
  acct withdraw 10                                //> java.lang.Error: Insufficent funds
                                                  //| 	at week3.BankAccount.withdraw(BankAccount.scala:13)
                                                  //| 	at week3.bank_account$$anonfun$main$1.apply$mcV$sp(week3.bank_account.sc
                                                  //| ala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.bank_account$.main(week3.bank_account.scala:3)
                                                  //| 	at week3.bank_account.main(week3.bank_account.scala)
}