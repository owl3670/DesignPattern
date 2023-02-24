package factory.abstractfactory.pizzastore

import factory.abstractfactory.pizza.Pizza

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