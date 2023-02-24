package factory.abstractfactory.pizzastore

import factory.abstractfactory.factory.NYPizzaIngredientFactory
import factory.abstractfactory.pizza.*

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory = NYPizzaIngredientFactory()

        return when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "NY Style Cheese Pizza"
                pizza
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "NY Style Veggie Pizza"
                pizza
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "NY Style Clam Pizza"
                pizza
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "NY Style Pepperoni Pizza"
                pizza
            }
            else -> null
        }
    }
}