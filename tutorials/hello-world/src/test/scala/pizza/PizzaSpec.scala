package pizza

import org.scalatest._

class PizzaSpec  extends FunSuite with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  test("new pizza has zero toppings") {
    assert(pizza.getToppings.isEmpty)
  }

  test("adding one topping") {
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size === 1)
  }

  test("add two toppings and remove one, result should be one topping in list"){
    pizza.addTopping(Topping("extra cheese"))
    pizza.addTopping(Topping("extra tomato sauce"))

    pizza.removeTopping(Topping("extra tomato sauce"))

    assert(pizza.getToppings.size === 1)
  }

  // mark test to create later
  test("test pizza pricing") (pending)
}