package Chapter4.pizzaTwo.store;

import Chapter4.pizzaTwo.pizza.Pizza;
import Chapter4.pizzaTwo.factory.ChicagoPizzaIngredientFactory;
import Chapter4.pizzaTwo.factory.PizzaIngredientFactory;
import Chapter4.pizzaTwo.pizza.ChicagoCheesePizza;
import Chapter4.pizzaTwo.pizza.ChicagoClamPizza;
import Chapter4.pizzaTwo.pizza.ChicagoPepperoniPizza;
import Chapter4.pizzaTwo.pizza.ChicagoVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("시카고 스타일 치즈 피자");
        } else if(type.equals("pepperoni")){
            pizza = new ChicagoPepperoniPizza(ingredientFactory);
            pizza.setName("시카고 스타일 페퍼로니 피자");
        } else if(type.equals("clam")){
            pizza = new ChicagoClamPizza(ingredientFactory);
            pizza.setName("시카고 스타일 조개 피자");
        } else if(type.equals("veggie")){
            pizza = new ChicagoVeggiePizza(ingredientFactory);
            pizza.setName("시카고 스타일 야채 피자");
        }

        return pizza;

    }
    
}
