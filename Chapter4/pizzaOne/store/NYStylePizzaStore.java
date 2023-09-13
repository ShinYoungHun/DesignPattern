package Chapter4.pizzaOne.store;

import Chapter4.pizzaOne.pizza.NYCheesePizza;
import Chapter4.pizzaOne.pizza.NYClamPizza;
import Chapter4.pizzaOne.pizza.NYPepperoniPizza;
import Chapter4.pizzaOne.pizza.NYVeggiePizza;
import Chapter4.pizzaOne.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

    protected Pizza createPizza(String type) {
         if(type.equals("cheese")){
            return new NYCheesePizza();
        } else if(type.equals("pepperoni")){
            return new NYPepperoniPizza();
        } else if(type.equals("clam")){
            return new NYClamPizza();
        } else if(type.equals("veggie")){
            return new NYVeggiePizza();
        }else{
            return null;
        }
    }
    
}
