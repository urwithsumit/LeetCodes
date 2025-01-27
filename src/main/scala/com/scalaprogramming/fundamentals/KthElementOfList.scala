package com.scalaprogramming.fundamentals

/**
  * Find the Kth element of a ls.
  * By convention, the first element in the ls is element 0.
  * Example:
  *
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object KthElementOfList extends App {

  def kthElement[T](k: Int, list: List[T]): T = {

    def kth(idx: Int, list: List[T]): T =
      list match {
        case head :: _ if k == idx => head
        case _ :: tail => kth(idx + 1, tail)
        case _ => throw new NoSuchElementException
      }

    kth(0, list)
  }

  println(kthElement(2, List(1, 1, 2, 3, 5, 8)))
  println(kthElement(9, List(1, 1, 2, 3, 5, 8)))
  println(kthElement(-3, List(1, 1, 2, 3, 5, 8)))

}
