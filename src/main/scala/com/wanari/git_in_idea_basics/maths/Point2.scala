package com.wanari.git_in_idea_basics.maths

case class Point2(x: Double, y: Double) { left: Point2 =>
  def +(right: Point2): Point2 = {
    println(s"Adding two points. Point 1: $left, Point 2: $right")
    Point2(left.x + right.x, left.y + right.y)
  }

  def -(right: Point2): Point2 = {
    println(s"Subtracting two points. Point 1: $left, Point 2: $right")
    Point2(left.x - right.x, left.y + right.y)
  }

  def *(scalar: Double): Point2 = {
    println(s"Scalar multiplication of a point. Scalar: $scalar, point: $left")
    Point2(scalar * x, scalar * y)
  }
}
