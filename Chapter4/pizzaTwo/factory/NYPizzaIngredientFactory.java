package Chapter4.pizzaTwo.factory;

import Chapter4.pizzaTwo.ingredient.Cheese;
import Chapter4.pizzaTwo.ingredient.Clams;
import Chapter4.pizzaTwo.ingredient.Dough;
import Chapter4.pizzaTwo.ingredient.FreshClams;
import Chapter4.pizzaTwo.ingredient.Garlic;
import Chapter4.pizzaTwo.ingredient.MarinaraSauce;
import Chapter4.pizzaTwo.ingredient.Mushroom;
import Chapter4.pizzaTwo.ingredient.Onion;
import Chapter4.pizzaTwo.ingredient.Pepperoni;
import Chapter4.pizzaTwo.ingredient.RedPepper;
import Chapter4.pizzaTwo.ingredient.ReggianoCheese;
import Chapter4.pizzaTwo.ingredient.Sauce;
import Chapter4.pizzaTwo.ingredient.SlicedPepperoni;
import Chapter4.pizzaTwo.ingredient.ThinCrustDough;
import Chapter4.pizzaTwo.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();        
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();        
    }

    
    
}
