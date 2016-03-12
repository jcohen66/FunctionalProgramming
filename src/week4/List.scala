package week4

import java.util.NoSuchElementException

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object List extends App {
  def apply[T]() = Nil
  def apply[T](x: T) = new Cons(x, new Nil)
  def apply[T](x1: T, x2: T) = new Cons(x1, new Cons(x2, new Nil))

  override def main(args: Array[String]) {

    List()
    List(1)
    List(2, 3)
  }
}

