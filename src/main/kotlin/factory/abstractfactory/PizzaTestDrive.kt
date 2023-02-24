package factory.abstractfactory

import factory.abstractfactory.pizzastore.ChicagoPizzaStore
import factory.abstractfactory.pizzastore.NYPizzaStore

class PizzaTestDrive {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val nyStore = NYPizzaStore()
            val chicagoStore = ChicagoPizzaStore()

            var pizza = nyStore.orderPizza("cheese")
            println("Ethan ordered a ${pizza?.name}\n")

            pizza = chicagoStore.orderPizza("cheese")
            println("Joel ordered a ${pizza?.name}\n")
        }
    }
}