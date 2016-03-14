

object insertionsort {

  val list = List(7, 3, 9, 2)                     //> list  : List[Int] = List(7, 3, 9, 2)

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))

  }                                               //> isort: (xs: List[Int])List[Int]

  isort(list)                                     //> res0: List[Int] = List(2, 3, 7, 9)

  def removeAt[T](n: Int, xs: List[T]):List[T] = (xs take n) ::: xs drop n + 1
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]
 

	removeAt(1, list)                         //> res1: List[Int] = List(3, 9, 2)
	
	
	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
		case List() => ys		// Left list is empty so just return right list
		case z :: zs => z :: concat(zs, ys)
	}                                         //> concat: [T](xs: List[T], ys: List[T])List[T]
	
	val list2 = List(10, 11, 24)              //> list2  : List[Int] = List(10, 11, 24)
	
	concat(list, list2)                       //> res2: List[Int] = List(7, 3, 9, 2, 10, 11, 24)
	
	
	def reverse[T](xs: List[T]): List[T] = xs match {
		case List() => List()
		case y :: ys => reverse(ys) ++ List(y)
	}                                         //> reverse: [T](xs: List[T])List[T]
	
	reverse(list)                             //> res3: List[Int] = List(2, 9, 3, 7)
	
}