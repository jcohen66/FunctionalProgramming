package week4

object pm {
  trait Expr
case class Var(v: String) extends Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr



  val x = 1                                       //> x  : Int = 1


  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Prod(e1, e2) => eval(e1) * eval(e2)
  }                                               //> eval: (e: week4.pm.Expr)Int

  def show(e: Expr):String = e match {
    case Var(v) => v
    case Number(n) => n.toString
    case Sum(e1, e2) => "( " + show(e1) + "+" + show(e2) + " )"
    case Prod(e1, e2) => "( " + show(e1) + "*" + show(e2) + " )"
  }                                               //> show: (e: week4.pm.Expr)String

  show(Sum(Number(1), Number(44)))                //> res0: String = ( 1+44 )
	show(Sum(Number(1), Number(44)))          //> res1: String = ( 1+44 )
	show(Sum(Var("x"), Sum(Var("y"), Number(1))))
                                                  //> res2: String = ( x+( y+1 ) )
	show(Prod(Number(5), Sum(Var("x"), Sum(Var("y"), Number(1)))))
                                                  //> res3: String = ( 5*( x+( y+1 ) ) )

}