package composite.menuiterator

class NullMenu: MenuComponent() {
    override fun createIterator(): Iterator<MenuComponent> {
        throw UnsupportedOperationException()
    }
}