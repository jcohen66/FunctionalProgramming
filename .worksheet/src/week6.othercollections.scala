package week6

object othercollections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 

	val xs = Array(1, 2, 3, 44 );System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(21); val res$0 = 
	xs map (x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(25); 
	
	val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(27); val res$1 = 
	s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(29); val res$2 = 
	
	s exists (c => c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(27); val res$3 = 
	s forall (c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(35); 
	
	val pairs = List(1, 2, 4) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(13); val res$4 = 
	pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(33); val res$5 = 
	
	s flatMap (c => List('.', c));System.out.println("""res5: String = """ + $show(res$5));$skip(117); 
	

	def scalarProduct1(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct1: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(117); 

	def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map{ case (x, y) => x * y }.sum;System.out.println("""scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(96); 

	def isPrime(n: Int): Boolean = n match {
		case n if(n % 2) != 0 => true
		case _ => false
	};System.out.println("""isPrime: (n: Int)Boolean""");$skip(14); val res$6 = 
	
	isPrime(2);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(12); val res$7 = 
	isPrime(7);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(71); 

	def isPrime2(n: Int): Boolean = (2 until n) forall (d => n % 2 != 0);System.out.println("""isPrime2: (n: Int)Boolean""");$skip(13); val res$8 = 
	isPrime2(2);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(13); val res$9 = 
	isPrime2(7);System.out.println("""res9: Boolean = """ + $show(res$9))}
}
