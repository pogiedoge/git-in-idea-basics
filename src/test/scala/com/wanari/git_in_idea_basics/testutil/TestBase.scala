package com.wanari.git_in_idea_basics.testutil

import org.mockito.{ArgumentMatchersSugar, MockitoSugar}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

trait TestBase
    extends AnyWordSpecLike
    with Matchers
    with MockitoSugar
    with ArgumentMatchersSugar {
  def await[T](f: Future[T]): T = {
    Await.result(f, 5.seconds)
  }
}
