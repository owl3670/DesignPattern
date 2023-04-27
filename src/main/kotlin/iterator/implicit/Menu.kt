package iterator.implicit

interface Menu {
    fun createIterator(): Iterator<MenuItem?>
}