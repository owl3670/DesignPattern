package headfirst.designpatterns.iterator.dinermerger

import java.util.*

class AlternatingDinerMenuIterator(list: Array<MenuItem?>) : Iterator {
    var list: Array<MenuItem?>
    var position: Int

    init {
        this.list = list
        position = Calendar.DAY_OF_WEEK % 2
    }

    operator fun next(): MenuItem? {
        val menuItem: MenuItem? = list[position]
        position = position + 2
        return menuItem
    }

    operator fun hasNext(): Boolean {
        return if (position >= list.size || list[position] == null) {
            false
        } else {
            true
        }
    }

    override fun toString(): String {
        return "Alternating Diner Menu Iterator"
    }
}