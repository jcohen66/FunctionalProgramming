package week3


object overrides {

	def f[T](n: Int, l: scala.List[T]):T = {
		require (n < l.length, "index out of bounds")
		
		l(n)
	}                                         //> f: [T](n: Int, l: List[T])T

	def nth[T](n: Int, xs: week4.List[T]): T = {
		import week4._
		
		if (xs.isEmpty) throw new IndexOutOfBoundsException
		else if(n == 0) xs.head
		else nth(n - 1, xs.tail)
		
		
		}                                 //> nth: [T](n: Int, xs: week4.List[T])T

	val l = List(1,2,3,4,5)                   //> l  : List[Int] = List(1, 2, 3, 4, 5)
	
	f(3, l)                                   //> res0: Int = 4
	
	val list = new week4.Cons(1, new week4.Cons(2, new week4.Cons(3, new week4.Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@1a407d53
	
	nth(2, list)                              //> res1: Int = 3
	nth(-1, list)                             //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week3.overrides$$anonfun$main$1.nth$1(week3.overrides.scala:15)
                                                  //| 	at week3.overrides$$anonfun$main$1.apply$mcV$sp(week3.overrides.scala:29
                                                  //| )
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.overrides$.main(week3.overrides.scala:4)
                                                  //| 	at week3.overrides.main(week3.overrides.scala)

}

abstract class Base {
	def foo = 1
	def bar: Int
}

class Sub extends Base {
	override def foo = 2
	def bar = 3
}