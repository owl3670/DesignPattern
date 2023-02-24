package factory.pizza

abstract class Pizza {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings: MutableList<String> = mutableListOf()

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        for (topping in toppings) {
            println(" $topping")
        }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    fun getName(): String? {
        return name
    }
}