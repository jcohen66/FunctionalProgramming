package week2

object exercise {
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  		if (n == 0) acc
  		else loop(acc * n, n-1)
  	loop(1, n)
  }                                               //> factorial: (n: Int)Int
  factorial(4)                                    //> res0: Int = 24
  
  // Generalized Sum function
  def sum(f: Int => Int, a: Int, b: Int): Int =
  	if (a > b) 0
  	else f(a) + sum(f, a + 1, b)              //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  // Using anonymous functions
  def SumInts(a: Int, b: Int) = sum(x => x, a, b) //> SumInts: (a: Int, b: Int)Int
  def SumCubes(a: Int, b: Int) = sum(x => x*x*x, a, b)
                                                  //> SumCubes: (a: Int, b: Int)Int
  def SumFactorials(a: Int, b: Int) = sum(fact, a, b)
                                                  //> SumFactorials: (a: Int, b: Int)Int
  
  // Specific Sum functions
  def sumInts(a: Int, b: Int) = sum(id, a, b)     //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int) = sum(cube, a, b)  //> sumCubes: (a: Int, b: Int)Int
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int
  
  // Functions to be passed
  def id(x: Int): Int = x                         //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  def fact(x: Int): Int = if (x == 0) 1 else fact( x - 1 )
                                                  //> fact: (x: Int)Int
  
  
  def tSum(f: Int => Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if(a > b) acc
  		else loop(a, f(a) + acc)
  	}
  	loop(a, 0)
  }                                               //> tSum: (f: Int => Int)(a: Int, b: Int)Int
 
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if( a > b ) 1
  	else f(a) * product(f)(a + 1, b)
  	}                                         //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  product(x => x * x)(3, 4)                       //> res1: Int = 144
 
 
   def factorial2(n: Int) = product(x => x)(1, n) //> factorial2: (n: Int)Int
   
   factorial(4)                                   //> res2: Int = 24
  
  
   def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
   	 if( a > b ) zero
   	 else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b
                                                  //| : Int)Int
   	
   def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a,b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
  
   product2(x => x * x)(3,4)                      //> res3: Int = 144
  
  def sum2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x + y, 1)(a,b)
                                                  //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  
  sum2(x => x + x)(3,4)                           //> res4: Int = 15
  
  
  
   
 
  
}