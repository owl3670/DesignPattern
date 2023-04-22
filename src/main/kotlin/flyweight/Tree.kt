package flyweight

import java.time.LocalDate

interface Tree {
    fun display(x: Int, y: Int)

    fun isWithinRange(aDate: LocalDate): Boolean{
        val month = aDate.month
        return (month.value > 2) && (month.value < 11)
    }
}