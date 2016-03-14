package week5

object mergesort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(558); 


  def msort[T](xs: List[T])( lt: (T, T) => Boolean): List[T] = {
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
            if (lt(x, y)) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)

        }
        
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }
  };System.out.println("""msort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]""");$skip(33); 

  val l1 = (1 to 10000).toList;System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(39); val res$0 = 
  msort(l1)((x: Int, y: Int) => x < y);System.out.println("""res0: List[Int] = """ + $show(res$0))}

}
