package composite.menu

class MenuItem : MenuComponent {
    private val name: String
    private val description: String
    private val vegetarian: Boolean
    private val price: Double

    constructor(name: String, description: String, vegetarian: Boolean, price: Double) {
        this.name = name
        this.description = description
        this.vegetarian = vegetarian
        this.price = price
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getPrice(): Double {
        return price
    }

    override fun isVegetarian(): Boolean {
        return vegetarian
    }

    override fun print() {
        print("  $name")
        if (vegetarian) {
            print("(v)")
        }
        println(", $price")
        println("     -- $description")
    }
}