package controllers

import models.Greeting
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class HelloController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def greeting(): Action[AnyContent] = Action {
    Ok(Json.toJson(new Greeting("Hello")))
  }
}
