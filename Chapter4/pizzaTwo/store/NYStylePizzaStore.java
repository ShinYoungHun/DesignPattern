package Chapter4.pizzaTwo.store;

import Chapter4.pizzaTwo.factory.NYPizzaIngredientFactory;
import Chapter4.pizzaTwo.factory.PizzaIngredientFactory;
import Chapter4.pizzaTwo.pizza.NYCheesePizza;
import Chapter4.pizzaTwo.pizza.NYClamPizza;
import Chapter4.pizzaTwo.pizza.NYPepperoniPizza;
import Chapter4.pizzaTwo.pizza.NYVeggiePizza;
import Chapter4.pizzaTwo.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if(type.equals("pepperoni")){
            pizza = new NYPepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        } else if(type.equals("clam")){
            pizza = new NYClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if(type.equals("veggie")){
            pizza = new NYVeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        }

        return pizza;
        
    }
    
}
