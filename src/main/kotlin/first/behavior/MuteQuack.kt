package first.behavior

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}