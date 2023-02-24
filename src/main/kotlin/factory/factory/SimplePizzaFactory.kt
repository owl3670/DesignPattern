package factory.factory

import factory.pizza.CheesePizza
import factory.pizza.GreekPizza
import factory.pizza.PepperoniPizza
import factory.pizza.Pizza

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null
        if (type == "cheese") {
            pizza = CheesePizza()
        } else if (type == "greek") {
            pizza = GreekPizza()
        } else if (type == "pepperoni") {
            pizza = PepperoniPizza()
        }
        return pizza
    }
}