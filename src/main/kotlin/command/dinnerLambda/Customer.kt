package command.dinnerLambda

class Customer(
    val waitress: Waitress,
    val cook: Cook
) {
    var order: Order? = null

    fun createOrder(){
        order = object : Order {
            override fun orderUp() {
                cook.makeBurger()
                cook.makeFries()
            }
        }
    }

    fun hungry() {
        order?.let { waitress.takeOrder(it) }
    }
}