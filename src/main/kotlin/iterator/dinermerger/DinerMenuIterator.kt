package iterator.dinermerger

class DinerMenuIterator(private val items: Array<MenuItem?>) : Iterator {
	var position = 0

	override fun next(): MenuItem? {
		/*
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
        */

		// or shorten to
		return items[position++]
	}

	override fun hasNext(): Boolean {
		/*
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
        */

		// or shorten to
		return items.size > position
	}
}