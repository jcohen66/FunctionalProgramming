package week4

object insertionsort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 

	val list = List(7,3, 9, 2);System.out.println("""list  : week4.Cons[(Int, Int, Int, Int)] = """ + $show(list ));$skip(121); 
	
	
	def isort(xs: List[Int]): List[Int] = xs match {
	 case List() => List()
	 case y :: ys => insert(y, isort(ys))

	};System.out.println("""isort: (xs: week4.List[Int])week4.List[Int]""")}
}
