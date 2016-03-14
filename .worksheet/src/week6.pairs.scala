package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(14); 

  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(65); 
  val xss = (1 until n) map (i => (1 until i) map (j => (i, j)));System.out.println("""xss  : scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(xss ));$skip(14); val res$0 = 
  xss.flatten;System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(118); 
  val xss1 = (1 until n) flatMap (i => (1 until i) map (j => (i, j))) filter (pair =>
    isPrime(pair._1 + pair._2));System.out.println("""xss1  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(xss1 ));$skip(87); val res$1 = 

  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(204); 

  // (xs zip ys).map{ case (x, y) => x * y }.sum

  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
    (
      for {
        (x, y) <- (xs zip ys)
      } yield x * y
      ).sum;System.out.println("""scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double""")}

}
