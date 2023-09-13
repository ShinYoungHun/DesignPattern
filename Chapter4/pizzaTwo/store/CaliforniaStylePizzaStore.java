package Chapter4.pizzaTwo.store;

import Chapter4.pizzaTwo.pizza.Pizza;
import Chapter4.pizzaTwo.factory.CaliforniaPizzaIngredientFactory;
import Chapter4.pizzaTwo.factory.PizzaIngredientFactory;
import Chapter4.pizzaTwo.pizza.CaliforniaCheesePizza;
import Chapter4.pizzaTwo.pizza.CaliforniaClamPizza;
import Chapter4.pizzaTwo.pizza.CaliforniaPepperoniPizza;
import Chapter4.pizzaTwo.pizza.CaliforniaVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CaliforniaCheesePizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 치즈 피자");
        } else if(type.equals("pepperoni")){
            pizza = new CaliforniaPepperoniPizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 페퍼로니 피자");
        } else if(type.equals("clam")){
            pizza = new CaliforniaClamPizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 조개 피자");
        } else if(type.equals("veggie")){
            pizza = new CaliforniaVeggiePizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 야채 피자");
        }

        return pizza;

    }
    
}
