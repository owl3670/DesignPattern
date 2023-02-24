package factory.factorymethod.pizza

import factory.factorymethod.pizza.Pizza

class ChicagoStyleCheesePizza : Pizza() {
    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
    }
}