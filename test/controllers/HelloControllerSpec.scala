package controllers

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.test.Helpers
import play.api.test.Helpers.status

import scala.concurrent.Future

class HelloControllerSpec extends AnyWordSpec with Matchers with GuiceOneAppPerTest {
  "GET /" should {
    "return 200" in new TestSetup {
      val result = controller.greeting()

//      TODO
//      status()
    }
  }

  trait TestSetup {
    val controller = new HelloController(Helpers.stubControllerComponents())
  }
}
