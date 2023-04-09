package composite.menuiterator

class NullIterator: Iterator<MenuComponent> {
    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): MenuComponent {
        return NullMenu()
    }
}