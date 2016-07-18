package Week6

object sequence_operations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
	val xs = Array(1,2,3,4);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(25); 
	val ys = Array(5,6,7,8);System.out.println("""ys  : Array[Int] = """ + $show(ys ));$skip(25); val res$0 = 
	xs exists (x => x == 1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(25); val res$1 = 
	xs forall (x => x == 1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(11); val res$2 = 
	xs zip ys;System.out.println("""res2: Array[(Int, Int)] = """ + $show(res$2));$skip(19); 
	val z = xs zip ys;System.out.println("""z  : Array[(Int, Int)] = """ + $show(z ));$skip(9); val res$3 = 
	z.unzip;System.out.println("""res3: (Array[Int], Array[Int]) = """ + $show(res$3));$skip(29); val res$4 = 
	xs flatMap (x => List(0,x));System.out.println("""res4: Array[Int] = """ + $show(res$4));$skip(8); val res$5 = 
	xs.sum;System.out.println("""res5: Int = """ + $show(res$5));$skip(12); val res$6 = 
	xs.product;System.out.println("""res6: Int = """ + $show(res$6));$skip(8); val res$7 = 
	xs.max;System.out.println("""res7: Int = """ + $show(res$7));$skip(8); val res$8 = 
	xs.min;System.out.println("""res8: Int = """ + $show(res$8))}
}
