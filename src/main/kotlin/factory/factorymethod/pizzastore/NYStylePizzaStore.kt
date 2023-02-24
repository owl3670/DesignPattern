package factory.factorymethod.pizzastore

import factory.factorymethod.pizza.*
import factory.factorymethod.pizza.Pizza

class NYStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> NYStyleCheesePizza()
            "veggie" -> NYStyleVeggiePizza()
            "clam" -> NYStyleClamPizza()
            "pepperoni" -> NYStylePepperoniPizza()
            else -> null
        }
    }
}