package flyweight

import java.time.LocalDate

class DeciduousTree : Tree{
    override fun display(x: Int, y: Int) {
        println("Deciduous tree is located at $x, $y")
        if(!isWithinRange(LocalDate.now())){
            println("The tree currently has no leaves")
        }
    }

}