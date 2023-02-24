package factory.factorymethod.pizza

class ChicagoStyleVeggiePizza : Pizza() {
    init {
        name = "Chicago Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }
}