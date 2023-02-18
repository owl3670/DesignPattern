package first.behavior

class FlyNoWay : QuackBehavior {
    override fun quack() {
        println("I can't fly")
    }
}