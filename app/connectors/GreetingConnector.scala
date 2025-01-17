package connectors

import com.google.inject.Singleton

@Singleton
class GreetingConnector {
  def retrieveHelloGreeting = "Hello From Connector"
}
