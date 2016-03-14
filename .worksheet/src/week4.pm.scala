package week4

object pm {
  trait Expr
case class Var(v: String) extends Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(229); 



  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(156); 


  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Prod(e1, e2) => eval(e1) * eval(e2)
  };System.out.println("""eval: (e: week4.pm.Expr)Int""");$skip(227); 

  def show(e: Expr):String = e match {
    case Var(v) => v
    case Number(n) => n.toString
    case Sum(e1, e2) => "( " + show(e1) + "+" + show(e2) + " )"
    case Prod(e1, e2) => "( " + show(e1) + "*" + show(e2) + " )"
  };System.out.println("""show: (e: week4.pm.Expr)String""");$skip(36); val res$0 = 

  show(Sum(Number(1), Number(44)));System.out.println("""res0: String = """ + $show(res$0));$skip(34); val res$1 = 
	show(Sum(Number(1), Number(44)));System.out.println("""res1: String = """ + $show(res$1));$skip(47); val res$2 = 
	show(Sum(Var("x"), Sum(Var("y"), Number(1))));System.out.println("""res2: String = """ + $show(res$2));$skip(64); val res$3 = 
	show(Prod(Number(5), Sum(Var("x"), Sum(Var("y"), Number(1)))));System.out.println("""res3: String = """ + $show(res$3))}

}
