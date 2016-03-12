package week2

object fixedpoints {
  def abs(x: Double): Double = if (x < 0) -x else x
                                                  //> abs: (x: Double)Double
  
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) =
  	abs((x - y) / x) < tolerance              //> isCloseEnough: (x: Double, y: Double)Boolean
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		println("Guess: " + guess)
  		val next = f(guess)
  		if (isCloseEnough(guess, next)) next
  		else iterate(next)
  	}
  	iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  fixedPoint(x => 1 + x/2)(1)                     //> Guess: 1.0
                                                  //| Guess: 1.5
                                                  //| Guess: 1.75
                                                  //| Guess: 1.875
                                                  //| Guess: 1.9375
                                                  //| Guess: 1.96875
                                                  //| Guess: 1.984375
                                                  //| Guess: 1.9921875
                                                  //| Guess: 1.99609375
                                                  //| Guess: 1.998046875
                                                  //| Guess: 1.9990234375
                                                  //| Guess: 1.99951171875
                                                  //| Guess: 1.999755859375
                                                  //| res0: Double = 1.9998779296875
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  
    
  def sqrt(x: Double) = fixedPoint( averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
  
 	sqrt(2)                                   //> Guess: 1.0
                                                  //| Guess: 1.5
                                                  //| Guess: 1.4166666666666665
                                                  //| Guess: 1.4142156862745097
                                                  //| res1: Double = 1.4142135623746899
}