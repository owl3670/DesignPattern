package decorator.decorator

import decorator.beverage.Beverage

class Mocha(
    beverage: Beverage? = null
) : CondimentDecorator(
    beverage = beverage
) {
    override val description: String
        get() = beverage?.description + ", Mocha"

    override fun cost(): Double {
        return beverage?.cost()?.plus(.20) ?: 0.0
    }
}