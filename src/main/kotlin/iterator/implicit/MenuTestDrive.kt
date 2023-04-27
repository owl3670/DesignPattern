package iterator.implicit

class MenuTestDrive {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pancakeHouseMenu = PancakeHouseMenu()
            val dinerMenu = DinerMenu()
            val waitress = Waitress(pancakeHouseMenu, dinerMenu)
            waitress.printMenu()
        }
    }
}