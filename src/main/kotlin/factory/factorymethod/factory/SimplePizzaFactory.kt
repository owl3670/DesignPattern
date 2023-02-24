package factory.factorymethod.factory

import factory.factorymethod.pizza.CheesePizza
import factory.factorymethod.pizza.ClamPizza
import factory.factorymethod.pizza.PepperoniPizza
import factory.factorymethod.pizza.Pizza
import factory.factorymethod.pizza.VeggiePizza

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null
        if (type == "cheese") {
            pizza = CheesePizza()
        } else if (type == "pepperoni") {
            pizza = PepperoniPizza()
        } else if (type == "clam") {
             pizza = ClamPizza()
        } else if (type == "veggie") {
             pizza = VeggiePizza()
        }
        return pizza
    }
}