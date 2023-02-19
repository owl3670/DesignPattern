package decorator.decorator

import decorator.beverage.Beverage

class Soy(
    beverage: Beverage? = null
) : CondimentDecorator(
    beverage = beverage
) {
    override val description: String
        get() = beverage?.description + ", Soy"

    override fun cost(): Double {
        return beverage?.cost()?.plus(.15) ?: 0.0
    }
}