package com.dvwilliamson.fp

import org.scalatest.{Matchers, WordSpec}

class Chapter2Spec extends WordSpec with Matchers {

  "fib" should {
    "calculate the nth fibonacci number correctly" when {

      val expected: Seq[Int] = Seq(0, 1, 1, 2, 3, 5, 8, 13, 21)

      expected.zipWithIndex.foreach {
        case (n, i) =>
          s"""fib($i) == $n""" in assert(Chapter2.fib(i) == n)
      }
    }
  }

  "isSorted" should {
    def ascending(a: Int, b: Int): Boolean = a <= b

    "return true" when {
      "the input is a sorted sequence" in {
        val arr: Array[Int] = Seq(-4, -3, -2, -1, 0, 1, 2, 3, 4).toArray
        assert(Chapter2.isSorted(arr, ascending))
      }
      "the input is a sorted sequence with repeating numbers" in {
        val arr: Array[Int] = Seq(-2, -1, 0, 1, 2, 2, 2, 3, 4).toArray
        assert(Chapter2.isSorted(arr, ascending))
      }
    }
    "return false" when {
      "the sequence is not sorted" in {
        val arr: Array[Int] = Seq(-2, -4, 0, 1, 3, 4).toArray
        assert(!Chapter2.isSorted(arr, ascending))
      }
    }
  }

}
