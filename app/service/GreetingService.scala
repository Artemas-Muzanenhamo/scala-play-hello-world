package service

import com.google.inject.{Inject, Singleton}
import connectors.GreetingConnector

@Singleton
class GreetingService @Inject() (val greetingConnector: GreetingConnector) {
  def sayHello: String = greetingConnector.retrieveHelloGreeting
}
