package example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.scalatestplus.junit5.JUnitSuite

class HelloSpec extends JUnitSuite {

  @Test
  def helloTest(): Unit = {
    assertEquals(Hello.greeting, "hello")
  }

}
