package week3

object rationals {
  val x = new Rational(1,2)                       //> x  : week3.Rational = 1/2
	x.numer                                   //> res0: Int = 1
	x.denom                                   //> res1: Int = 2
	
	val y = new Rational(2,3)                 //> y  : week3.Rational = 2/3
	x.add(y)                                  //> res2: week3.Rational = 7/6
	
	x.neg()                                   //> res3: week3.Rational = -1/2
	
	new Rational(1,1).sub(new Rational(1, 2)) //> res4: week3.Rational = 1/2
	
	new Rational(1,1).sub(new Rational(1, 2)).sub(new Rational(1,4))
                                                  //> res5: week3.Rational = 2/8
	new Rational(1,3).sub(new Rational(5, 7)).sub(new Rational(3,2))
                                                  //> res6: week3.Rational = -79/42
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