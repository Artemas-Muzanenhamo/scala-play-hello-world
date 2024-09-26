package models

import play.api.libs.json.{Format, Json, OWrites, Reads}

case class Greeting(greeting: String)

object Greeting {
  implicit val greetingValue: Format[Greeting] = Json.format[Greeting]
}
