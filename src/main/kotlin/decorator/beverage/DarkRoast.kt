package decorator.beverage

class DarkRoast : Beverage() {
    override val description: String
        get() = "Dark Roast Coffee"

    override fun cost(): Double {
        return .99
    }
}