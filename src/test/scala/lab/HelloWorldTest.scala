package lab

import org.junit.Test

class HelloWorldTest {
  @Test
  def helloWorld_test(): Unit ={
    val hello = new HelloWorld()
    hello.sayHello("bob")
  }
}
