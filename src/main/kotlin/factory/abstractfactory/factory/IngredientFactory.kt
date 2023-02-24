package factory.abstractfactory.factory

import factory.abstractfactory.ingredient.*

interface IngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): MutableList<Veggie>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}