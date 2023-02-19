package decorator.decorator

import decorator.beverage.Beverage

abstract class CondimentDecorator(
    var beverage: Beverage? = null
) : Beverage()