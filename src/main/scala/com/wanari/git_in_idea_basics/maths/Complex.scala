package com.wanari.git_in_idea_basics.maths

import scala.math._

case class Complex(real: Double, imaginary: Double) { left: Complex =>
  case class Trigonometric(r: Double, angle: Double) {
    def apply: Complex = {
      Complex(r * cos(angle), r * sin(angle))
    }
  }

  def toTrigonometric: Trigonometric = Trigonometric(r, angle)

  case class Exponential(r: Double, theta: Double) {
    def apply: Complex = {
      Complex(r * cos(angle), r * sin(angle))
    }
  }

  def toExponential: Exponential = Exponential(r, angle)

  def r: Double = {
    sqrt(real * real + imaginary * imaginary)
  }

  // Degree
  def angle: Double = {
    if (real > 0) {
      toDegrees(atan(imaginary / real))
    } else if (real < 0) {
      toDegrees(toRadians(90) + atan(imaginary / real))
    } else {
      0
    }
  }

  def inv: Complex = Complex(left.real, -1 * left.imaginary)

  def +(right: Complex): Complex = {
    Complex(left.real + right.real, left.imaginary + right.imaginary)
  }

  def -(right: Complex): Complex = {
    Complex(left.real - right.real, left.imaginary - right.imaginary)
  }

  def *(right: Complex): Complex = {
    val leftTri = left.toTrigonometric
    val rightTri = right.toTrigonometric
    Trigonometric(leftTri.r * rightTri.r, leftTri.angle + rightTri.angle).apply
  }

  def ^(power: Double): Complex = {
    val tri = toTrigonometric
    Trigonometric(pow(tri.r, power), toDegrees(toRadians(tri.angle) * power)).apply
  }
}
