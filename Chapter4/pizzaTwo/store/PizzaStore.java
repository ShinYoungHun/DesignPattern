package Chapter4.pizzaTwo.store;

import Chapter4.pizzaTwo.pizza.Pizza;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);
    
    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    

}
