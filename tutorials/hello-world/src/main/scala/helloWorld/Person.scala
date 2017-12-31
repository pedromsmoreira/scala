package helloWorld

case class Person() {

  private var _name = ""

  def name = _name

  def name_= (value: String): Unit = _name = value
}
