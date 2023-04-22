package flyweight

class ConiferTree : Tree {
    override fun display(x: Int, y: Int) {
        println("Conifer tree is located at $x, $y")
    }
}