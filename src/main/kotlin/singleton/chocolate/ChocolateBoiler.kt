package singleton.chocolate

class ChocolateBoiler {
    private var empty: Boolean = true
    private var boiled: Boolean = false

    companion object {
        private var uniqueInstance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler {
            if (uniqueInstance == null) {
                uniqueInstance = ChocolateBoiler()
            }
            return uniqueInstance!!
        }
    }

    fun fill() {
        if (this.isEmpty()) {
            this.empty = false
            this.boiled = false
        }
    }

    fun drain() {
        if (!this.isEmpty() && this.isBoiled()) {
            this.empty = true
        }
    }

    fun boil() {
        if (!this.isEmpty() && !this.isBoiled()) {
            this.boiled = true
        }
    }

    fun isEmpty(): Boolean {
        return this.empty
    }

    fun isBoiled(): Boolean {
        return this.boiled
    }
}