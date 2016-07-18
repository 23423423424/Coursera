package recfun

object balance {

  def balance(chars: List[Char]): Boolean = {
    def value(chars: List[Char], sum: Int): Boolean = {
      if (chars.isEmpty) true
      else {
        val head = chars.head
        val temp =
          if (head == '(') sum + 1
          else if (head == ')') sum - 1
          else sum
        if (temp >= 0) value(chars.tail, temp)
        else false
      }
    }
    value(chars,0)
  }                                               //> balance: (chars: List[Char])Boolean

  balance("(just an) example".toList)             //> res0: Boolean = true
  balance("(if (zero? x) max (/ 1 x))".toList)    //> res1: Boolean = true
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
                                                  //> res2: Boolean = true
  balance(":-)".toList)                           //> res3: Boolean = false
  balance("())(".toList)                          //> res4: Boolean = false

}