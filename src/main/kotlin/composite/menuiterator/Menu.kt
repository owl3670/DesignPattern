package composite.menuiterator

class Menu(
    private val name: String,
    private val description: String
) : MenuComponent() {
    private val menuComponents: MutableList<MenuComponent> = mutableListOf()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun createIterator(): Iterator<MenuComponent> {
        return CompositeIterator(menuComponents.iterator())
    }

    override fun print() {
        println("\n$name, $description")
        println("---------------------")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}