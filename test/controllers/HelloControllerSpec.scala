package controllers

import models.Greeting
import org.mockito.Mockito.when
import org.scalatest.matchers.must.Matchers.mustBe
import org.scalatestplus.mockito.MockitoSugar.mock
import org.scalatestplus.play.PlaySpec
import play.api.http.Status.OK
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Result, Results}
import play.api.test.Helpers.{contentAsJson, defaultAwaitTimeout, status}
import play.api.test.{FakeRequest, Helpers}
import service.GreetingService

import scala.concurrent.Future

class HelloControllerSpec extends PlaySpec with Results {
  "GET /" should {
    "should return 200 and a body with a JSON value 'Hello'" in new TestSetup {
      val result: Future[Result] = controller.greeting().apply(FakeRequest())

      status(result) mustBe OK
      val bodyJsonValue: JsValue = contentAsJson(result)
      private val expectedValue: JsValue = Json.toJson(new Greeting("Hello Test"))
      bodyJsonValue mustBe expectedValue
    }
  }

  trait TestSetup {
    val greetingServiceMock: GreetingService = mock[GreetingService]
    when(greetingServiceMock.sayHello).thenReturn("Hello Test")
    
    val controller = HelloController(Helpers.stubControllerComponents(), greetingServiceMock)
  }
}
