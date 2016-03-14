package week5

object reductionoflists {

	def sumR(xs: List[Int]): Int = xs match {
		case Nil => 0		// Unit value
		case y :: ys => y + sum(ys)
	}                                         //> sumR: (xs: List[Int])Int


	def sum(xs: List[Int]): Int =
		(0 :: xs) reduceLeft ((x, y) => x + y)
                                                  //> sum: (xs: List[Int])Int

	def prod(xs: List[Int]): Int =
		(1 :: xs) reduceLeft ((x, y) => x * y)
                                                  //> prod: (xs: List[Int])Int

	def sum2(xs: List[Int]): Int =
		(xs foldLeft (0))(_ + _)          //> sum2: (xs: List[Int])Int

	def prod2(xs: List[Int]): Int =
		(xs foldLeft (1))(_ * _)          //> prod2: (xs: List[Int])Int

		
	val l = List(1,2,3,4,5)                   //> l  : List[Int] = List(1, 2, 3, 4, 5)
	sum(l)                                    //> res0: Int = 15

	prod(l)                                   //> res1: Int = 120

	sum2(l)                                   //> res2: Int = 15

	prod2(l)                                  //> res3: Int = 120


	def concat[T](xs: List[T], ys: List[T]): List[T] =
		(xs foldRight ys) (_ :: _)        //> concat: [T](xs: List[T], ys: List[T])List[T]
		
	val l2 = List(9,8,7,6)                    //> l2  : List[Int] = List(9, 8, 7, 6)
	
	concat(l, l2)                             //> res4: List[Int] = List(1, 2, 3, 4, 5, 9, 8, 7, 6)

}