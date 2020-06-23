package com.wanari.git_in_idea_basics.maths

case class Vec2(start: Point2, end: Point2) { left: Vec2 =>
  def +(right: Vec2): Vec2 = {
    Vec2(left.start + right.start, left.end + right.end)
  }

  def -(right: Vec2): Vec2 = {
    Vec2(left.start - right.start, left.end - right.end)
  }

  def *(scalar: Double): Vec2 = {
    Vec2(start * scalar, end * scalar)
  }
}
