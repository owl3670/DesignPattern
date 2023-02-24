package factory.abstractfactory.pizza

import factory.abstractfactory.ingredient.*

abstract class Pizza {
    var name: String? = null

    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: MutableList<Veggie> = mutableListOf()
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clams: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String{
        val result = StringBuilder()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        if (veggies.isNotEmpty()) {
            for (veggie in veggies) {
                result.append(veggie)
                result.append("\n")
            }
        }
        if (clams != null) {
            result.append(clams)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }
}