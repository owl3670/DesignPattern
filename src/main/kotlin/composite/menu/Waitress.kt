package composite.menu

class Waitress {
    private val allMenus: MenuComponent

    constructor(allMenus: MenuComponent) {
        this.allMenus = allMenus
    }

    fun printMenu() {
        allMenus.print()
    }
}