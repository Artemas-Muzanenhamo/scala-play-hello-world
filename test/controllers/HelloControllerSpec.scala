package controllers

import org.scalatest.matchers.must.Matchers.mustBe
import org.scalatestplus.play.PlaySpec
import play.api.mvc.{Result, Results}
import play.api.test.Helpers.{contentAsString, defaultAwaitTimeout}
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

class HelloControllerSpec extends PlaySpec with Results {
  "GET /" should {
    "return 200" in new TestSetup {
      val result: Future[Result] = controller.greeting().apply(FakeRequest())
      
      val bodyText: String = contentAsString(result)
      bodyText.mustBe("Hello")
    }
  }

  trait TestSetup {
    val controller = new HelloController(Helpers.stubControllerComponents())
  }
}
