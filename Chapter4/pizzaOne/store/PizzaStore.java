package Chapter4.pizzaOne.store;

import Chapter4.pizzaOne.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
