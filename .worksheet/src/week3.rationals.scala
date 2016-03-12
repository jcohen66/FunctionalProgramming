package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,2);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(9); val res$0 = 
	x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(29); 
	
	val y = new Rational(2,3);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(10); val res$2 = 
	x.add(y);System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(11); val res$3 = 
	
	x.neg();System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(45); val res$4 = 
	
	new Rational(1,1).sub(new Rational(1, 2));System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(68); val res$5 = 
	
	new Rational(1,1).sub(new Rational(1, 2)).sub(new Rational(1,4));System.out.println("""res5: week3.Rational = """ + $show(res$5));$skip(66); val res$6 = 
	new Rational(1,3).sub(new Rational(5, 7)).sub(new Rational(3,2));System.out.println("""res6: week3.Rational = """ + $show(res$6))}
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
		numer * that.denom + that.numer * denom,
		denom * that.denom)
		
	def neg() = new Rational(numer * -1, denom)
	
	def sub(that: Rational) =
		new Rational(
		numer * that.denom - that.numer * denom,
		denom * that.denom)
		
	override def toString() = numer + "/" + denom
}
