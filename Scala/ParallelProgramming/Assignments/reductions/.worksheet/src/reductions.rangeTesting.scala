package reductions

object rangeTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
	val start = 1;System.out.println("""start  : Int = """ + $show(start ));$skip(13); 
	val end = 4;System.out.println("""end  : Int = """ + $show(end ));$skip(14); val res$0 = 
	start to end;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(17); val res$1 = 
	start until end;System.out.println("""res1: scala.collection.immutable.Range = """ + $show(res$1))}
	
}
