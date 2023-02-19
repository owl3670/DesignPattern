package decorator.decorator

import decorator.beverage.Beverage

class Whip(
    beverage: Beverage? = null
) : CondimentDecorator(
    beverage = beverage
) {
    override val description: String
        get() = beverage?.description + ", Whip"

    override fun cost(): Double {
        return beverage?.cost()?.plus(.10) ?: 0.0
    }
}