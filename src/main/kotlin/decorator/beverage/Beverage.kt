package decorator.beverage

abstract class Beverage {
    abstract val description: String
    abstract fun cost(): Double
}