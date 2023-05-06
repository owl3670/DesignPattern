package iterator.dinermerger

import java.util.*
import java.util.function.Consumer

object MenuTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val pancakeHouseMenu: Menu = PancakeHouseMenu()
        val dinerMenu: Menu = DinerMenu()
        val waitress = Waitress(pancakeHouseMenu, dinerMenu)

        // With iterators
        waitress.printMenu()
        printMenus()
    }

    /*
	 * Without the Waitress, we need the code below...
	 */
    fun printMenus() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()
        val breakfastItems: List<MenuItem> = pancakeHouseMenu.menuItems
        val lunchItems = dinerMenu.menuItems

        // print as Iterable
        printMenu(breakfastItems)
        printMenu(Arrays.asList(*lunchItems))

        // print with forEach
        println("=== forEach ===")
        breakfastItems.forEach(Consumer { item: MenuItem? ->
            println(
                item
            )
        })
        Arrays.asList(*lunchItems).forEach(Consumer { item: MenuItem? ->
            println(
                item
            )
        })
        println("=== forEach ===")

        // Using enhanced for loop
        println("USING ENHANCED FOR")
        for (menuItem in breakfastItems) {
            print(menuItem.name)
            println("\t\t" + menuItem.price)
            println("\t" + menuItem.description)
        }
        for (menuItem in lunchItems) {
            print(menuItem!!.name)
            println("\t\t" + menuItem.price)
            println("\t" + menuItem.description)
        }

        // Exposing implementation
        println("USING FOR LOOPS")
        for (i in breakfastItems.indices) {
            val menuItem = breakfastItems[i]
            print(menuItem.name)
            println("\t\t" + menuItem.price)
            println("\t" + menuItem.description)
        }
        for (i in lunchItems.indices) {
            val menuItem = lunchItems[i]
            print(menuItem!!.name)
            println("\t\t" + menuItem.price)
            println("\t" + menuItem.description)
        }
    }

    fun printMenu(a: Iterable<MenuItem?>) {
        for (menuItem in a) {
            print(menuItem!!.name)
            println("\t\t" + menuItem!!.price)
            println("\t" + menuItem!!.description)
        }
    }
}