

object insertionsort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 

  val list = List(7, 3, 9, 2);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(157); 

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(126); 

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))

  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(16); val res$0 = 

  isort(list);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(81); 

  def removeAt[T](n: Int, xs: List[T]):List[T] = (xs take n) ::: xs drop n + 1;System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(23); val res$1 = 
 

	removeAt(1, list);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(179); 
	
	
	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
		case List() => ys		// Left list is empty so just return right list
		case z :: zs => z :: concat(zs, ys)
	};System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(33); 
	
	val list2 = List(10, 11, 24);System.out.println("""list2  : List[Int] = """ + $show(list2 ));$skip(24); val res$2 = 
	
	concat(list, list2);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(125); 
	
	
	def reverse[T](xs: List[T]): List[T] = xs match {
		case List() => List()
		case y :: ys => reverse(ys) ++ List(y)
	};System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(18); val res$3 = 
	
	reverse(list);System.out.println("""res3: List[Int] = """ + $show(res$3))}
	
}
