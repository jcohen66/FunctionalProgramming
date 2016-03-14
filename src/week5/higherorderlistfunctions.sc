package week5

object higherorderlistfunctions {
	def scaleList(xs: List[Double], factor: Int): List[Double] = xs match {
		case Nil => xs
		case y :: ys => y * factor :: scaleList(ys, factor)
	}                                         //> scaleList: (xs: List[Double], factor: Int)List[Double]
	
	val l = List(1.0,2.0,3.0,4.0,5.0,6.0)     //> l  : List[Double] = List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
	
	scaleList(l, 5)                           //> res0: List[Double] = List(5.0, 10.0, 15.0, 20.0, 25.0, 30.0)

	def scaleListMap(xs: List[Double], factor: Int): List[Double] =
		xs map (x => x * factor)          //> scaleListMap: (xs: List[Double], factor: Int)List[Double]
		
	scaleListMap(l, 5)                        //> res1: List[Double] = List(5.0, 10.0, 15.0, 20.0, 25.0, 30.0)
	
	
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y :: ys => y * y :: squareList(ys)
	}                                         //> squareList: (xs: List[Int])List[Int]
	
	val l2 = List(1,2,3,4,5)                  //> l2  : List[Int] = List(1, 2, 3, 4, 5)
	
	squareList(l2)                            //> res2: List[Int] = List(1, 4, 9, 16, 25)
	
	def squareList2(xs: List[Int]): List[Int] =
		xs map (x => x * x)               //> squareList2: (xs: List[Int])List[Int]
	
	squareList2(l2)                           //> res3: List[Int] = List(1, 4, 9, 16, 25)
	
	def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => if(y > 0) y :: posElems(ys) else posElems(ys)
	}                                         //> posElems: (xs: List[Int])List[Int]
	
	posElems(List(1,2,-3,4,5))                //> res4: List[Int] = List(1, 2, 4, 5)
		
	def posElems2(xs: List[Int]): List[Int] =
		xs filter (x => x > 0)            //> posElems2: (xs: List[Int])List[Int]
		
	posElems2(List(1,2,-3,4,5))               //> res5: List[Int] = List(1, 2, 4, 5)
}