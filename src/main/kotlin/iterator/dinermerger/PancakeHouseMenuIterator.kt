package iterator.dinermerger

class PancakeHouseMenuIterator(var items: List<MenuItem>) :
    Iterator {
    var position = 0
    override fun next(): MenuItem? {
        /*
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
		*/
        // or shorten to:
        return items[position++]
    }

    override fun hasNext(): Boolean {
        /*
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
		*/
        // or shorten to:
        return items.size > position
    }
}