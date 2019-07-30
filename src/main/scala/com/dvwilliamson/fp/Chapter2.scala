package com.dvwilliamson.fp

object Chapter2 {

  // Exercise 2.1
  def fib(n: Int): Int = {

    @annotation.tailrec
    def go(a: Int, b: Int, n: Int): Int = {
      if (n == 0) a
      else go(b, a+b, n-1)
    }

    if (n <= 0) return 0
    if (n == 1) return 1

    go(0, 1, n)
  }

  // Exercise 2.2 - Generic Typing
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def compare(pos: Int): Boolean = {
      if (as.length-1 <= pos) return true
      if (ordered(as(pos), as(pos+1))) {
        compare(pos+1)
      } else {
        false
      }
    }

    compare(0)
  }




  def main(args: Array[String]): Unit = {

  }
}