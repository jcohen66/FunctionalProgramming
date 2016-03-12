package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(9); val res$0 = 
	x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(17); val res$2 = 
	x.sub(y).sub(z);System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(11); val res$3 = 
	x - y - z;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(12); val res$4 = 
	
	x.add(y);System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(7); val res$5 = 
	x + y;System.out.println("""res5: week3.Rational = """ + $show(res$5));$skip(10); val res$6 = 
	y.add(y);System.out.println("""res6: week3.Rational = """ + $show(res$6));$skip(7); val res$7 = 
	y + y;System.out.println("""res7: week3.Rational = """ + $show(res$7));$skip(9); val res$8 = 
	x.neg();System.out.println("""res8: week3.Rational = """ + $show(res$8));$skip(4); val res$9 = 
	-x;System.out.println("""res9: week3.Rational = """ + $show(res$9));$skip(13); val res$10 = 
	
	x.less(y);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(7); val res$11 = 
	x < y;System.out.println("""res11: Boolean = """ + $show(res$11));$skip(11); val res$12 = 

	x.max(y);System.out.println("""res12: week3.Rational = """ + $show(res$12));$skip(37); 
	
	val a = new Rational(10000, 1000);System.out.println("""a  : week3.Rational = """ + $show(a ))}
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")

	def this(x: Int) = this(x, 1)	// Auxiliary constructor calls primary constructor.=

	
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
		numer * that.denom + that.numer * denom,
		denom * that.denom)
		
	def + (that: Rational) =
		this.add(that)
			
	def neg() = new Rational(numer * -1, denom)
	
	def unary_- = this.neg()
	
	def sub(that: Rational) =
		new Rational(
		numer * that.denom - that.numer * denom,
		denom * that.denom)
		
	def - (that: Rational) =
		this + that.neg()
		
	def less(that: Rational) =
		numer * that.denom	< that.numer * denom
	
	def < (that: Rational) =
		this.less(that)
	
	def max(that: Rational) =
		if (this < that) that else this
		
	override def toString() = {
		def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
		val g = gcd(x, y)		// Calculated immediately (byVal)
		
		numer / g + "/" + denom / g
	}
}
