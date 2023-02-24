package factory.factorymethod

import factory.factorymethod.pizzastore.ChicagoStylePizzaStore
import factory.factorymethod.pizzastore.NYStylePizzaStore

class PizzaTestDrive {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val nyStore = NYStylePizzaStore()
            val chicagoStore = ChicagoStylePizzaStore()

            var pizza = nyStore.orderPizza("cheese")
            println("Ethan ordered a ${pizza?.name}\n")

            pizza = chicagoStore.orderPizza("cheese")
            println("Joel ordered a ${pizza?.name}\n")

            pizza = nyStore.orderPizza("veggie")
            println("Ethan ordered a ${pizza?.name}\n")

            pizza = chicagoStore.orderPizza("veggie")
            println("Joel ordered a ${pizza?.name}\n")

            pizza = nyStore.orderPizza("clam")
            println("Ethan ordered a ${pizza?.name}\n")

            pizza = chicagoStore.orderPizza("clam")
            println("Joel ordered a ${pizza?.name}\n")

            pizza = nyStore.orderPizza("pepperoni")
            println("Ethan ordered a ${pizza?.name}\n")

            pizza = chicagoStore.orderPizza("pepperoni")
            println("Joel ordered a ${pizza?.name}\n")
        }
    }
}