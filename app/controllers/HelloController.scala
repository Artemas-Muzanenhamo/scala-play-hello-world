package controllers

import play.api.mvc.{BaseController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class HelloController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def greeting() = Action {
    Ok("Hello")
  }
}