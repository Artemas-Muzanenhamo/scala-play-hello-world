package movie

import play.api.libs.json.{Format, Json, OWrites, Reads}

case class Movie(id: String, title: String)

object Movie {
  implicit val format: Format[Movie] = Json.format[Movie]
}
