package com.wanari.git_in_idea_basics.maths

case class Point3(x: Double, y: Double, z: Double) { left: Point3 =>
  println(s"Point3 created P($x; $y; $z).")

  def +(right: Point3): Point3 = {
    println(s"Adding two three-dimensional points. Left: $left, right: $right.")
    Point3(left.x + right.x, left.y + right.y, left.z + right.z)
  }

  def -(right: Point3): Point3 = {
    println(s"Subtracting two three-dimensional points. Left: $left, right: $right.")
    Point3(left.x - right.x, left.y + right.y, left.z - right.z)
  }

  def *(scalar: Double): Point3 = {
    println(s"Scalar multiplication of a three-dimensional point. Scalar: $scalar, point: $left.")
    Point3(scalar * x, scalar * y, scalar * z)
  }
}
