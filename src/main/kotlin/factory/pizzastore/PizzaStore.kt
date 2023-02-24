package factory.pizzastore

import factory.pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza? {
        val pizza = this.createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }

    abstract fun createPizza(type: String): Pizza?
}