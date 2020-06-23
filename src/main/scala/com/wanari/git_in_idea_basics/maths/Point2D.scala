package com.wanari.git_in_idea_basics.maths

case class Point2D(x: Double, y: Double) { left: Point2D =>
  def +(right: Point2D): Point2D = {
    println(s"(${left.x}+${right.x}, ${left.y}+${right.y})")
    Point2D(left.x + right.x, left.y + right.y)
  }

  def -(right: Point2D): Point2D = {
    println(s"(${left.x}-${right.x}, ${left.y}-${right.y})")
    Point2D(left.x - right.x, left.y + right.y)
  }

  def *(scalar: Double): Point2D = {
    println(s"(${left.x}*scalar, ${left.y}*scalar)")
    Point2D(scalar * x, scalar * y)
  }
}
