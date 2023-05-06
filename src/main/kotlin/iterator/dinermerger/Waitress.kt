package iterator.dinermerger

class Waitress(var pancakeHouseMenu: Menu, var dinerMenu: Menu) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            print(menuItem!!.name + ", ")
            print(menuItem.price.toString() + " -- ")
            println(menuItem.description)
        }
    }

    fun printVegetarianMenu() {
        printVegetarianMenu(pancakeHouseMenu.createIterator())
        printVegetarianMenu(dinerMenu.createIterator())
    }

    fun isItemVegetarian(name: String): Boolean {
        val breakfastIterator = pancakeHouseMenu.createIterator()
        if (isVegetarian(name, breakfastIterator)) {
            return true
        }
        val dinnerIterator = dinerMenu.createIterator()
        return isVegetarian(name, dinnerIterator)
    }

    private fun printVegetarianMenu(iterator: Iterator?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            if (menuItem!!.isVegetarian) {
                print(menuItem.name)
                println("\t\t" + menuItem.price)
                println("\t" + menuItem.description)
            }
        }
    }

    private fun isVegetarian(name: String, iterator: Iterator?): Boolean {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            if (menuItem!!.name == name) {
                if (menuItem.isVegetarian) {
                    return true
                }
            }
        }
        return false
    }
}