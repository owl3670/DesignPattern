package factory.pizza

class GreekPizza : Pizza() {
    init {
        name = "Greek Pizza"
        dough = "Crust"
        sauce = "Marinara sauce"
        toppings.add("Shredded mozzarella")
        toppings.add("Black olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }
}