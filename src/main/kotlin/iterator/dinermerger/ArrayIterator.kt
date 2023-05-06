package iterator.dinermerger

class ArrayIterator(private val items: Array<MenuItem?>) : Iterator {
    var position = 0

    override fun next(): MenuItem? {
        val menuItem: MenuItem? = items[position]
        position += 1
        return menuItem
    }

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }
}