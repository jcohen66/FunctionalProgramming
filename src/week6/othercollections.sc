package week6

object othercollections {

	val xs = Array(1, 2, 3, 44 )              //> xs  : Array[Int] = Array(1, 2, 3, 44)
	xs map (x => x * 2)                       //> res0: Array[Int] = Array(2, 4, 6, 88)
	
	val s = "Hello World"                     //> s  : String = Hello World
	s filter (c => c.isUpper)                 //> res1: String = HW
	
	s exists (c => c.isUpper)                 //> res2: Boolean = true
	s forall (c => c.isUpper)                 //> res3: Boolean = false
	
	val pairs = List(1, 2, 4) zip s           //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (4,l))
	pairs.unzip                               //> res4: (List[Int], List[Char]) = (List(1, 2, 4),List(H, e, l))
	
	s flatMap (c => List('.', c))             //> res5: String = .H.e.l.l.o. .W.o.r.l.d
	

	def scalarProduct1(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map(xy => xy._1 * xy._2).sum
                                                  //> scalarProduct1: (xs: Vector[Double], ys: Vector[Double])Double

	def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map{ case (x, y) => x * y }.sum
                                                  //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double

	def isPrime(n: Int): Boolean = n match {
		case n if(n % 2) != 0 => true
		case _ => false
	}                                         //> isPrime: (n: Int)Boolean
	
	isPrime(2)                                //> res6: Boolean = false
	isPrime(7)                                //> res7: Boolean = true

	def isPrime2(n: Int): Boolean = (2 until n) forall (d => n % 2 != 0)
                                                  //> isPrime2: (n: Int)Boolean
	isPrime2(2)                               //> res8: Boolean = true
	isPrime2(7)                               //> res9: Boolean = true
}