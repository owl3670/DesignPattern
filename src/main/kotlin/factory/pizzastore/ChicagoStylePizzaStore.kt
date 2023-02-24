package factory.pizzastore

import factory.pizza.*

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