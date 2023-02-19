package decorator.beverage

class Espresso : Beverage() {
    override val description: String
        get() = "Espresso"

    override fun cost(): Double {
        return 1.99
    }
}