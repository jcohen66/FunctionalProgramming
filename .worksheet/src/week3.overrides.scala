package week3


object overrides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(138); 

	def f[T](n: Int, l: scala.List[T]):T = {
		require (n < l.length, "index out of bounds")
		
		l(n)
	};System.out.println("""f: [T](n: Int, l: List[T])T""");$skip(184); 

	def nth[T](n: Int, xs: week4.List[T]): T = {
		import week4._
		
		if (xs.isEmpty) throw new IndexOutOfBoundsException
		else if(n == 0) xs.head
		else nth(n - 1, xs.tail)
		
		
		};System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(26); 

	val l = List(1,2,3,4,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(11); val res$0 = 
	
	f(3, l);System.out.println("""res0: Int = """ + $show(res$0));$skip(85); 
	
	val list = new week4.Cons(1, new week4.Cons(2, new week4.Cons(3, new week4.Nil)));System.out.println("""list  : week4.Cons[Int] = """ + $show(list ));$skip(16); val res$1 = 
	
	nth(2, list);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
	nth(-1, list);System.out.println("""res2: Int = """ + $show(res$2))}

}

abstract class Base {
	def foo = 1
	def bar: Int
}

class Sub extends Base {
	override def foo = 2
	def bar = 3
}
