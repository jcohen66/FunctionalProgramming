package week4

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

object Number {
	def apply(n: Int) = new Number(n)
}



object patternmatching {

	def eval(e: Expr): Int = e match {
	
		case Number(n) => n
		case Sum(e1, e2) => eval(e1) + eval(e2)

}
