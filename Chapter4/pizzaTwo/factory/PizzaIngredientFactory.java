package Chapter4.pizzaTwo.factory;

import Chapter4.pizzaTwo.ingredient.Cheese;
import Chapter4.pizzaTwo.ingredient.Clams;
import Chapter4.pizzaTwo.ingredient.Dough;
import Chapter4.pizzaTwo.ingredient.Pepperoni;
import Chapter4.pizzaTwo.ingredient.Sauce;
import Chapter4.pizzaTwo.ingredient.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
