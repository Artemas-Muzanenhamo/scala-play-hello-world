package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Greeting(greeting: String)

object Greeting {
  implicit val greetingValue: OFormat[Greeting] = Json.format[Greeting]
}
