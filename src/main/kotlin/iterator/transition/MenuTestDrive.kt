package iterator.transition

object MenuTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()
        val menus: ArrayList<Menu> = ArrayList<Menu>()
        menus.add(pancakeHouseMenu)
        menus.add(dinerMenu)
        val waitress = Waitress(menus)
        waitress.printMenu()
    }
}