package controllers

import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with Greeting {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(greeting)
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
