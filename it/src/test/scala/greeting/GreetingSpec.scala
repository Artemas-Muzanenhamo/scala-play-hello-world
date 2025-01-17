package greeting

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach}
import org.scalatestplus.play.guice.GuiceOneServerPerSuite
import play.api.http.Status
import play.api.http.Status.OK
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.libs.json.Json
import play.api.libs.ws.{WSClient, WSRequest}
import play.api.test.Helpers.{await, defaultAwaitTimeout}
import play.api.{Application, Environment, Mode}

class GreetingSpec extends AnyFlatSpec with GuiceOneServerPerSuite with BeforeAndAfterEach with BeforeAndAfterAll {
  lazy val client: WSClient = app.injector.instanceOf[WSClient]

  override implicit lazy val app: Application = new GuiceApplicationBuilder()
    .in(Environment.simple(mode = Mode.Dev))
    .build()

  def buildRequest(path: String): WSRequest = client.url(s"http://localhost:$port$path").withFollowRedirects(false)
  
  "The Greeting test" should "pass" in {
    val request = buildRequest("/")
    
    val response = await(request.get())
    
    response.status shouldBe OK
    response.json shouldBe Json.parse("""{"greeting": "Hello From Connector"}""")
  }
}
