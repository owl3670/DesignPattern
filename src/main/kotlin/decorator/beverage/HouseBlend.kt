package decorator.beverage

class HouseBlend : Beverage() {
    override val description: String
        get() = "House Blend Coffee"

    override fun cost(): Double {
        return .89
    }
}