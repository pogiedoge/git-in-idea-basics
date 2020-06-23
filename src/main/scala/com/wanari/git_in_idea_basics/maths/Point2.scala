package com.wanari.git_in_idea_basics.maths

case class Point2(x: Double, y: Double) { left: Point2 =>
  def +(right: Point2): Point2 = {
    Point2(left.x + right.x, left.y + right.y)
  }

  def -(right: Point2): Point2 = {
    Point2(left.x - right.x, left.y + right.y)
  }

  def *(scalar: Double): Point2 = {
    Point2(scalar * x, scalar * y)
  }
}
