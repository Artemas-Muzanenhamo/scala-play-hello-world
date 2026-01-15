package controllers

import models.Greeting
import org.mockito.Mockito.when
import org.scalatest.matchers.must.Matchers.mustBe
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatestplus.mockito.MockitoSugar.mock
import org.scalatestplus.play.PlaySpec
import play.api.http.Status.OK
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Result, Results}
import play.api.test.Helpers.{contentAsJson, defaultAwaitTimeout, status}
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

class HelloControllerSpec extends AnyWordSpecLike {
  "GET /" should {
//    "should return 200 and a body with a JSON value 'Hello'" in new TestSetup {
    "should return 200 and a body with a JSON value 'Hello'" in {
      val controller: HelloController = HelloController(Helpers.stubControllerComponents())
      val result: Future[Result] = controller.greeting().apply(FakeRequest())

      status(result) mustBe OK
      val bodyJsonValue: JsValue = contentAsJson(result)
      val expectedValue: JsValue = Json.toJson(new Greeting("Hello From Connector"))
      
      bodyJsonValue mustBe expectedValue
    }
  }

//   Use this TestSetup when you want to add the Service
//  trait TestSetup {
//    val greetingServiceMock: GreetingService = mock[GreetingService]
//    when(greetingServiceMock.sayHello).thenReturn("Hello Test")
//    
//    val controller = HelloController(Helpers.stubControllerComponents(), greetingServiceMock)
//  }
}
