package command.dinner

class Customer(
    private val waitress: Waitress
) {
    private lateinit var order: Order

    fun createOrder(order: Order) {
        this.order = order
    }

    fun hungry() {
        waitress.takeOrder(order)
    }
}