package com.wanari.git_in_idea_basics.maths

import com.wanari.git_in_idea_basics.testutil.TestBase

class ComplexSpec extends TestBase {
	trait TestScope {
		val c1: Complex = Complex(1, 2.5)
		val c2: Complex = Complex(23, -3)
	}

	"Complex" should {
		"add two complex numbers" in new TestScope {
			c1 + c2 shouldEqual Complex(24, -0.5)
		}

		"subtract two complex numbers" in new TestScope {
			c1 - c2 shouldEqual Complex(-22, 5.5)
		}
	}
}
