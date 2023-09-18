package Chapter4.pizzaOne.store;

import Chapter4.pizzaOne.pizza.Pizza;
import Chapter4.pizzaOne.pizza.ChicagoCheesePizza;
import Chapter4.pizzaOne.pizza.ChicagoClamPizza;
import Chapter4.pizzaOne.pizza.ChicagoPepperoniPizza;
import Chapter4.pizzaOne.pizza.ChicagoVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new ChicagoCheesePizza();
        }else if(type.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        }else if(type.equals("clam")){
            return new ChicagoClamPizza();
        }else if(type.equals("veggie")){
            return new ChicagoVeggiePizza();
        }else {
            return null;
        }

    }
    
}
