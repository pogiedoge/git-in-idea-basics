package com.wanari.git_in_idea_basics.maths

case class Point3(x: Double, y: Double, z: Double) { left: Point3 =>
  def +(right: Point3): Point3 = {
    Point3(left.x + right.x, left.y + right.y, left.z + right.z)
  }

  def -(right: Point3): Point3 = {
    Point3(left.x - right.x, left.y + right.y, left.z - right.z)
  }

  def *(scalar: Double): Point3 = {
    Point3(scalar * x, scalar * y, scalar * z)
  }
}
