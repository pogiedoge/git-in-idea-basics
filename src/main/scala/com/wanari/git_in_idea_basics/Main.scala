package com.wanari.git_in_idea_basics

import com.wanari.git_in_idea_basics.maths.Complex

object Main extends App {
  def printAll(c1: Complex, c2: Complex): Unit = {
    println(c1 + c2)
    println(c2 - c1)
    println(c1.r)
    println(c1.angle)
    println(c1.inv)
    println(c1.toTrigonometric)
    println(c1.toExponential)
    println(c1 ^ 2)
    println(c1 * c2)
  }

  val a = Complex(1, 2)
  val b = Complex(2, 1)

  printAll(a, b)
  println("hope this won't cause conflicts")
}
