package decorator

import decorator.beverage.Beverage
import decorator.beverage.DarkRoast
import decorator.beverage.Espresso
import decorator.beverage.HouseBlend
import decorator.decorator.Mocha
import decorator.decorator.Soy
import decorator.decorator.Whip

class StarbuzzCoffee {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var beverage: Beverage = Espresso()
            println("${beverage.description} $${beverage.cost()}")

            var beverage2: Beverage = DarkRoast()
            beverage2 = Mocha(beverage2)
            beverage2 = Mocha(beverage2)
            beverage2 = Whip(beverage2)
            println("${beverage2.description} $${beverage2.cost()}")

            var beverage3: Beverage = HouseBlend()
            beverage3 = Soy(beverage3)
            beverage3 = Mocha(beverage3)
            beverage3 = Whip(beverage3)
            println("${beverage3.description} $${beverage3.cost()}")
        }
    }
}