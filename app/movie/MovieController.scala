package movie

import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class MovieController @Inject()(val controllerComponents: ControllerComponents, val movieService: MovieService) extends BaseController {
  def getJamesBond: Action[AnyContent] = Action {
    Ok(Json.toJson(movieService.getJamesBondMovie))
  }
}
