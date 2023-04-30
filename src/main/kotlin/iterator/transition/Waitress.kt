package iterator.transition

class Waitress(menus: ArrayList<Menu>) {
    var menus: ArrayList<Menu>

    init {
        this.menus = menus
    }

    fun printMenu() {
        val menuIterator: Iterator<*> = menus.iterator()
        while (menuIterator.hasNext()) {
            val menu: Menu = menuIterator.next() as Menu
            printMenu(menu.createIterator())
        }
    }

    fun printMenu(iterator: Iterator<*>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            print(menuItem.name + ", ")
            print(menuItem.price.toString() + " -- ")
            println(menuItem.description)
        }
    }
}