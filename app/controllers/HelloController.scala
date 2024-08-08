package controllers

import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def greeting() = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }
}