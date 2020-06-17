package com.wanari.git_in_idea_basics

import com.wanari.git_in_idea_basics.maths.Complex

object Main extends App {
  val a = Complex(1, 2)
  val b = Complex(2, 1)
  println(a + b)
  println(b - a)
  println(a.r)
  println(a.angle)
  println(a.inv)
  println(a.toTrigonometric)
  println(a.toExponential)
  println(a ^ 2)
}
