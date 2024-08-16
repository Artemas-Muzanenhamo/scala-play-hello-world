package controllers

import play.api.libs.json.Json
import play.api.mvc.{BaseController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class HelloController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def greeting() = Action {
    val jsValue = Json.parse(
      """
        |{
        |   "greeting": "Hello"
        |}
        |""".stripMargin)
    Ok(jsValue)
  }
}