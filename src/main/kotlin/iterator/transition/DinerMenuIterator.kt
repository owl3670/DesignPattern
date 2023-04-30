package iterator.transition

class DinerMenuIterator(list: Array<MenuItem?>) :
	Iterator<MenuItem?> {
	private var list: Array<MenuItem?>
	var position = 0

	init {
		this.list = list
	}

	override fun next(): MenuItem? {
		val menuItem: MenuItem? = list[position]
		position += 1
		return menuItem
	}

	override fun hasNext(): Boolean {
		return !(position >= list.size || list[position] == null)
	}

	fun remove() {
		check(position > 0) { "You can't remove an item until you've done at least one next()" }
		if (list[position - 1] != null) {
			for (i in position - 1 until list.size - 1) {
				list[i] = list[i + 1]
			}
			list[list.size - 1] = null
		}
	}
}