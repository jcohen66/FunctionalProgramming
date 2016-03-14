package week5

import math.Ordering

object mergesort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(580); 


  def msort[T](xs: List[T])(ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys1) =>
            ys
          case (xs, Nil) =>
            xs
          case (x :: xs1, y :: ys1) =>
            if (ord.lt(x, y)) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)

        }
        
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(ord), msort(snd)(ord))
    }
  };System.out.println("""msort: [T](xs: List[T])(ord: scala.math.Ordering[T])List[T]""");$skip(33); 

  val l1 = (1 to 10000).toList;System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(26); val res$0 = 
  msort(l1)(Ordering.Int);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(59); 
   
   
 val fruits = List("apple", "pineapple", "orange");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(34); val res$1 = 
 
 msort(fruits)(Ordering.String);System.out.println("""res1: List[String] = """ + $show(res$1))}
 
}
