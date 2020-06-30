package com.wanari.git_in_idea_basics.maths

case class Vec3(start: Point3, end: Point3) { left: Vec3 =>
	def +(right: Vec3): Vec3 = {
		Vec3(left.start + right.start, left.end + right.end)
	}

	def -(right: Vec3): Vec3 = {
		Vec3(left.start - right.start, left.end - right.end)
	}

	def *(scalar: Double): Vec3 = {
		Vec3(start * scalar, end * scalar)
	}
}
