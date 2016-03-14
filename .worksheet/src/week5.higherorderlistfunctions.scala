package week5

object higherorderlistfunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
	def scaleList(xs: List[Double], factor: Int): List[Double] = xs match {
		case Nil => xs
		case y :: ys => y * factor :: scaleList(ys, factor)
	};System.out.println("""scaleList: (xs: List[Double], factor: Int)List[Double]""");$skip(41); 
	
	val l = List(1.0,2.0,3.0,4.0,5.0,6.0);System.out.println("""l  : List[Double] = """ + $show(l ));$skip(19); val res$0 = 
	
	scaleList(l, 5);System.out.println("""res0: List[Double] = """ + $show(res$0));$skip(93); 

	def scaleListMap(xs: List[Double], factor: Int): List[Double] =
		xs map (x => x * factor);System.out.println("""scaleListMap: (xs: List[Double], factor: Int)List[Double]""");$skip(23); val res$1 = 
		
	scaleListMap(l, 5);System.out.println("""res1: List[Double] = """ + $show(res$1));$skip(121); 
	
	
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y :: ys => y * y :: squareList(ys)
	};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(28); 
	
	val l2 = List(1,2,3,4,5);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(18); val res$2 = 
	
	squareList(l2);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(69); 
	
	def squareList2(xs: List[Int]): List[Int] =
		xs map (x => x * x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(19); val res$3 = 
	
	squareList2(l2);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(140); 
	
	def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => if(y > 0) y :: posElems(ys) else posElems(ys)
	};System.out.println("""posElems: (xs: List[Int])List[Int]""");$skip(30); val res$4 = 
	
	posElems(List(1,2,-3,4,5));System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(71); 
		
	def posElems2(xs: List[Int]): List[Int] =
		xs filter (x => x > 0);System.out.println("""posElems2: (xs: List[Int])List[Int]""");$skip(32); val res$5 = 
		
	posElems2(List(1,2,-3,4,5));System.out.println("""res5: List[Int] = """ + $show(res$5))}
}
