package week3

object rationals {
  val x = new Rational(1,3)                       //> x  : week3.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week3.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
	x.numer                                   //> res0: Int = 1
	x.denom                                   //> res1: Int = 3
	x.sub(y).sub(z)                           //> res2: week3.Rational = -79/42
	x - y - z                                 //> res3: week3.Rational = -79/42
	
	x.add(y)                                  //> res4: week3.Rational = 22/21
	x + y                                     //> res5: week3.Rational = 22/21
	y.add(y)                                  //> res6: week3.Rational = 10/7
	y + y                                     //> res7: week3.Rational = 10/7
	x.neg()                                   //> res8: week3.Rational = 1/-3
	-x                                        //> res9: week3.Rational = 1/-3
	
	x.less(y)                                 //> res10: Boolean = true
	x < y                                     //> res11: Boolean = true

	x.max(y)                                  //> res12: week3.Rational = 5/7
	
	val a = new Rational(10000, 1000)         //> a  : week3.Rational = 10/1
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