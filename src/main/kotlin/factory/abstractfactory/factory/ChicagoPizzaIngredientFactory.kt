package factory.abstractfactory.factory

import factory.abstractfactory.ingredient.*

class ChicagoPizzaIngredientFactory : IngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): MutableList<Veggie> {
        return mutableListOf(Spinach(), BlackOlives(), Eggplant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}