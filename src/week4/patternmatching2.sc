package week4

trait Expr
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
}

object patternmatching2 {

}
  