package iterator.implicit

class Waitress(
    private val pancakeHouseMenu: PancakeHouseMenu,
    private val dinerMenu: DinerMenu
) {
    fun printMenu() {
        val breakfastItems = pancakeHouseMenu.menuItems
        for (menuItem in breakfastItems) {
            printMenuItem(menuItem)
        }

        val lunchItems = dinerMenu.menuItems
        for (menuItem in lunchItems) {
            printMenuItem(menuItem)
        }
    }

    fun printMenuItem(menuItem: MenuItem?) {
        println("${menuItem?.name}, ${menuItem?.price} -- ${menuItem?.description}")
    }
}