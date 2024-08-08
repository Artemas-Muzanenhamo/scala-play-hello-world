package controllers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.scalatestplus.junit5.JUnitSuite

class HelloControllerSpec extends JUnitSuite {

  @Test
  def helloTest(): Unit = {
    assertEquals(HelloController.greeting, "hello")
  }

}
