package com.wanari.git_in_idea_basics.maths

case class Vec2(start: Point2, end: Point2) { left: Vec2 =>
  def +(right: Vec2): Vec2 = {
    println(s"Adding two two-dimensional vectors. Vec2 1: $left, Vec2 2: $right.")
    Vec2(left.start + right.start, left.end + right.end)
  }

  def -(right: Vec2): Vec2 = {
    println(s"Subtracting two two-dimensional vectors. Vec2 1: $left, Vec2 2: $right.")
    Vec2(left.start - right.start, left.end - right.end)
  }

  def *(scalar: Double): Vec2 = {
    println(s"Multiplying a two-dimensional vector with a scalar. Scalar: $scalar, Vec2: $left.")
    Vec2(start * scalar, end * scalar)
  }
}
