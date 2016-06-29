package recfun

object balance {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(424); 

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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(39); val res$0 = 

  balance("(just an) example".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(47); val res$1 = 
  balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(85); val res$2 = 
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(24); val res$3 = 
  balance(":-)".toList);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(25); val res$4 = 
  balance("())(".toList);System.out.println("""res4: Boolean = """ + $show(res$4))}

}
