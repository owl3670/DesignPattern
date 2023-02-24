package factory

import factory.factory.SimplePizzaFactory
import factory.pizza.Pizza

class PizzaStore {
    private val factory: SimplePizzaFactory = SimplePizzaFactory()

    fun orderPizza(type: String): Pizza? {
        val pizza = factory.createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }
}