package week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(168); 
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  		if (n == 0) acc
  		else loop(acc * n, n-1)
  	loop(1, n)
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$0 = 
  factorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(129); 
  
  // Generalized Sum function
  def sum(f: Int => Int, a: Int, b: Int): Int =
  	if (a > b) 0
  	else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(84); 
  
  // Using anonymous functions
  def SumInts(a: Int, b: Int) = sum(x => x, a, b);System.out.println("""SumInts: (a: Int, b: Int)Int""");$skip(55); 
  def SumCubes(a: Int, b: Int) = sum(x => x*x*x, a, b);System.out.println("""SumCubes: (a: Int, b: Int)Int""");$skip(54); 
  def SumFactorials(a: Int, b: Int) = sum(fact, a, b);System.out.println("""SumFactorials: (a: Int, b: Int)Int""");$skip(77); 
  
  // Specific Sum functions
  def sumInts(a: Int, b: Int) = sum(id, a, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(49); 
  def sumCubes(a: Int, b: Int) = sum(cube, a, b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(54); 
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b);System.out.println("""sumFactorials: (a: Int, b: Int)Int""");$skip(57); 
  
  // Functions to be passed
  def id(x: Int): Int = x;System.out.println("""id: (x: Int)Int""");$skip(36); 
  def cube(x: Int): Int = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(59); 
  def fact(x: Int): Int = if (x == 0) 1 else fact( x - 1 );System.out.println("""fact: (x: Int)Int""");$skip(166); 
  
  
  def tSum(f: Int => Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if(a > b) acc
  		else loop(a, f(a) + acc)
  	}
  	loop(a, 0)
  };System.out.println("""tSum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(114); 
 
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if( a > b ) 1
  	else f(a) * product(f)(a + 1, b)
  	};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(32); val res$1 = 
  	
  product(x => x * x)(3, 4);System.out.println("""res1: Int = """ + $show(res$1));$skip(54); 
 
 
   def factorial2(n: Int) = product(x => x)(1, n);System.out.println("""factorial2: (n: Int)Int""");$skip(20); val res$2 = 
   
   factorial(4);System.out.println("""res2: Int = """ + $show(res$2));$skip(185); 
  
  
   def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
   	 if( a > b ) zero
   	 else combine(f(a), mapReduce(f, combine, zero)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(96); 
   	
   def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a,b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(32); val res$3 = 
  
   product2(x => x * x)(3,4);System.out.println("""res3: Int = """ + $show(res$3));$skip(89); 
  
  def sum2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x + y, 1)(a,b);System.out.println("""sum2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$4 = 
  
  sum2(x => x + x)(3,4);System.out.println("""res4: Int = """ + $show(res$4))}
  
  
  
   
 
  
}
