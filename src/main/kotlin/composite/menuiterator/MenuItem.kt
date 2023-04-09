package composite.menuiterator

class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: Double
) : MenuComponent() {
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

    override fun createIterator(): Iterator<MenuComponent> {
        return NullIterator()
    }

    override fun print() {
        print(" $name")
        if (vegetarian) {
            print("(v)")
        }
        println(", $price")
        println(" -- $description")
    }
}