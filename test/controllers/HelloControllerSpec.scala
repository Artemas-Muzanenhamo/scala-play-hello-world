package controllers

import org.scalatest.matchers.must.Matchers.mustBe
import org.scalatestplus.play.PlaySpec
import play.api.http.Status.OK
import play.api.mvc.{Result, Results}
import play.api.test.Helpers.{contentAsString, defaultAwaitTimeout, status}
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

class HelloControllerSpec extends PlaySpec with Results {
  "GET /" should {
    "should return 200 and a body with value 'Hello'" in new TestSetup {
      val result: Future[Result] = controller.greeting().apply(FakeRequest())
      
      status(result) mustBe OK
      val bodyText: String = contentAsString(result)
      bodyText mustBe "Hello"
    }
  }

  trait TestSetup {
    val controller = new HelloController(Helpers.stubControllerComponents())
  }
}
