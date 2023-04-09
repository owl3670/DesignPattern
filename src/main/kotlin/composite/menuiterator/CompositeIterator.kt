package composite.menuiterator

import java.util.*

class CompositeIterator(
    private val iterator: Iterator<MenuComponent>
) : Iterator<MenuComponent> {
    private var stack: Stack<Iterator<MenuComponent>> = Stack()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        if (stack.isEmpty()) {
            return false
        } else {
            val iterator = stack.peek()
            if (!iterator.hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }

    override fun next(): MenuComponent {
        if (hasNext()) {
            val iterator = stack.peek()
            val component = iterator.next()
            stack.push(component.createIterator())
            return component
        } else {
            return NullMenu()
        }
    }
}