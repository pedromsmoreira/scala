package helloWorld

import org.scalatest.{BeforeAndAfter, FlatSpec}

class HelloWorldSpec extends FlatSpec with BeforeAndAfter{

  var helloWorld: HelloWorld = _

  before {
    helloWorld = new HelloWorld
  }

  "HelloWorld greet" should "have Hello World!" in {
    assert(helloWorld.greet() === "Hello World!")
  }

  "Hello World greet" should "have Hello Peter!" in {
    var person = new Person
    person.name_=("Peter")

    assert(helloWorld.greet(person) === "Hello Peter!")
  }
}

