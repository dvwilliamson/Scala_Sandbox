package com.dvwilliamson.fp

import com.dvwilliamson.fp.Chapter2._
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
        assert(isSorted(arr, ascending))
      }
      "the input is a sorted sequence with repeating numbers" in {
        val arr: Array[Int] = Seq(-2, -1, 0, 1, 2, 2, 2, 3, 4).toArray
        assert(isSorted(arr, ascending))
      }
    }
    "return false" when {
      "the sequence is not sorted" in {
        val arr: Array[Int] = Seq(-2, -4, 0, 1, 3, 4).toArray
        assert(!isSorted(arr, ascending))
      }
    }
  }

  "curry" should {
    "convert a function of two arguments to a function of one argument that partially applies f." in {
      val res = curry((a: Int, b:Int) => a + b)(14)(22)
      assert(res == 36)
    }
  }

  "uncurry" should {
    "convert a currying function to a single two parameter function" in {
      val res = uncurry((a: Int) => (b: Int) => a + b)(14, 22)
      assert(res == 36)
    }
  }

}
