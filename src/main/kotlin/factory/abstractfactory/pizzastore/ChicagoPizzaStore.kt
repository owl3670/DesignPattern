package factory.abstractfactory.pizzastore

import factory.abstractfactory.factory.ChicagoPizzaIngredientFactory
import factory.abstractfactory.pizza.*

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        return when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
                pizza
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"
                pizza
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"
                pizza
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"
                pizza
            }
            else -> null
        }
    }
}