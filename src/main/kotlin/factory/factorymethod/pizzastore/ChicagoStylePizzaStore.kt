package factory.factorymethod.pizzastore

import factory.factorymethod.pizza.*
import factory.factorymethod.pizza.Pizza

class ChicagoStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            "clam" -> ChicagoStyleClamPizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            else -> null
        }
    }
}