package iterator.dinermerger

import java.util.*

class AlternatingDinerMenuIterator(private val list: Array<MenuItem?>) : Iterator {
    var position: Int = Calendar.DAY_OF_WEEK % 2

    override fun next(): MenuItem? {
        val menuItem: MenuItem? = list[position]
        position += 2
        return menuItem
    }

    override fun hasNext(): Boolean {
        return !(position >= list.size || list[position] == null)
    }

    override fun toString(): String {
        return "Alternating Diner Menu Iterator"
    }
}