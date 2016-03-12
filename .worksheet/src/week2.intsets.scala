package week2

object intsets {
  
}

abstract class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
}
