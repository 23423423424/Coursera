package reductions

object midTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
  val from = 3;System.out.println("""from  : Int = """ + $show(from ));$skip(14); 
  val to = 10;System.out.println("""to  : Int = """ + $show(to ));$skip(28); 
  val mid = (from + to) / 2;System.out.println("""mid  : Int = """ + $show(mid ));$skip(36); 
  val mid1 = from + (to - from) / 2;System.out.println("""mid1  : Int = """ + $show(mid1 ))}

}
