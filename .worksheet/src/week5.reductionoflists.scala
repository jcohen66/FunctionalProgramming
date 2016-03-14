package week5

object reductionoflists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(148); 

	def sumR(xs: List[Int]): Int = xs match {
		case Nil => 0		// Unit value
		case y :: ys => y + sum(ys)
	};System.out.println("""sumR: (xs: List[Int])Int""");$skip(74); 


	def sum(xs: List[Int]): Int =
		(0 :: xs) reduceLeft ((x, y) => x + y);System.out.println("""sum: (xs: List[Int])Int""");$skip(74); 

	def prod(xs: List[Int]): Int =
		(1 :: xs) reduceLeft ((x, y) => x * y);System.out.println("""prod: (xs: List[Int])Int""");$skip(60); 

	def sum2(xs: List[Int]): Int =
		(xs foldLeft (0))(_ + _);System.out.println("""sum2: (xs: List[Int])Int""");$skip(61); 

	def prod2(xs: List[Int]): Int =
		(xs foldLeft (1))(_ * _);System.out.println("""prod2: (xs: List[Int])Int""");$skip(29); 

		
	val l = List(1,2,3,4,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(8); val res$0 = 
	sum(l);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 

	prod(l);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 

	sum2(l);System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 

	prod2(l);System.out.println("""res3: Int = """ + $show(res$3));$skip(83); 


	def concat[T](xs: List[T], ys: List[T]): List[T] =
		(xs foldRight ys) (_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(27); 
		
	val l2 = List(9,8,7,6);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(17); val res$4 = 
	
	concat(l, l2);System.out.println("""res4: List[Int] = """ + $show(res$4))}

}
