package Chapter4.pizzaOne.store;

import Chapter4.pizzaOne.pizza.Pizza;
import Chapter4.pizzaOne.pizza.CaliforniaCheesePizza;
import Chapter4.pizzaOne.pizza.CaliforniaClamPizza;
import Chapter4.pizzaOne.pizza.CaliforniaPepperoniPizza;
import Chapter4.pizzaOne.pizza.CaliforniaVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new CaliforniaCheesePizza();
        }else if(type.equals("pepperoni")){
            return new CaliforniaPepperoniPizza();
        }else if(type.equals("clam")){
            return new CaliforniaClamPizza();
        }else if(type.equals("veggie")){
            return new CaliforniaVeggiePizza();
        }else {
            return null;
        }

    }
    
}
