package Chapter4.pizzaTwo.pizza;

import Chapter4.pizzaTwo.factory.PizzaIngredientFactory;

public class BasicVeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public BasicVeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    
}
