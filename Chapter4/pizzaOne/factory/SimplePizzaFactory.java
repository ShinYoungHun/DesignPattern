package Chapter4.pizzaOne.factory;

import Chapter4.pizzaOne.pizza.BasicCheesePizza;
import Chapter4.pizzaOne.pizza.BasicClamPizza;
import Chapter4.pizzaOne.pizza.BasicPepperoniPizza;
import Chapter4.pizzaOne.pizza.Pizza;
import Chapter4.pizzaOne.pizza.BasicVeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new BasicCheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new BasicPepperoniPizza();
        } else if(type.equals("clam")){
            pizza = new BasicClamPizza();
        } else if(type.equals("veggie")){
            pizza = new BasicVeggiePizza();
        }

        return pizza;

    }

}
