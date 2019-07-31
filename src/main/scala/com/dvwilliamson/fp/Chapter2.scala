package com.dvwilliamson.fp

object Chapter2 {

  // Exercise 2.1 - Tail Recursion
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

  // Exercise 2.3 - Currying
  //   Currying converts a function f of two arguments into a function of one arguments that partially applies f.
  def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  // Exercise 2.4 - Uncurrying
  def uncurry[A,B,C](f: A => B => C): (A,B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}