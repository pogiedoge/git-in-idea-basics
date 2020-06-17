package com.wanari.git_in_idea_basics.maths

case class Vec2D(start: Point2D, end: Point2D) { left: Vec2D =>
  def +(right: Vec2D): Vec2D = {
    Vec2D(left.start + right.start, left.end + right.end)
  }

  def -(right: Vec2D): Vec2D = {
    Vec2D(left.start - right.start, left.end - right.end)
  }

  def *(scalar: Double): Vec2D = {
    Vec2D(start * scalar, end * scalar)
  }
}
