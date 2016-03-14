package week5




object mergesort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(274); 

	def merge(xs: List[Int], ys: List[Int]): List[Int] =
		(xs, ys) match {
			case (Nil, ys1) =>
				ys
			case (xs, Nil) =>
				xs
			case (x::xs1, y::ys1) =>
						if (x < y) x :: merge(xs1, ys)
						else y :: merge(xs, ys1)
						
		};System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(170); 
	


	def msort(xs: List[Int]): List[Int] = {
		val n = xs.length/2
		if (n == 0) xs
		else {
			
			val (fst, snd) = xs splitAt n
			merge(msort(fst), msort(snd))
		}
	};System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(32); 


	val l1 = (1 to 10000).toList;System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(11); val res$0 = 
	msort(l1);System.out.println("""res0: List[Int] = """ + $show(res$0))}

}
