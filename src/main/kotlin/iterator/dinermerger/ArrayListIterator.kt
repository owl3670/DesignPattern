package iterator.dinermerger

class ArrayListIterator(private val items: ArrayList<MenuItem?>) : Iterator {
    var position = 0

    override fun next(): MenuItem? {
        val item: MenuItem? = items[position]
        position += 1
        return item
    }

    override fun hasNext(): Boolean {
        return position < items.size
    }
}