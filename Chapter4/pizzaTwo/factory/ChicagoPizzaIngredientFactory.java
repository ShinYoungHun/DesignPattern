package Chapter4.pizzaTwo.factory;

import Chapter4.pizzaTwo.ingredient.BlackOlives;
import Chapter4.pizzaTwo.ingredient.Cheese;
import Chapter4.pizzaTwo.ingredient.Clams;
import Chapter4.pizzaTwo.ingredient.Dough;
import Chapter4.pizzaTwo.ingredient.Eggplant;
import Chapter4.pizzaTwo.ingredient.FrozenClams;
import Chapter4.pizzaTwo.ingredient.MozzarellaCheese;
import Chapter4.pizzaTwo.ingredient.Pepperoni;
import Chapter4.pizzaTwo.ingredient.PlumTomatoSauce;
import Chapter4.pizzaTwo.ingredient.Sauce;
import Chapter4.pizzaTwo.ingredient.SlicedPepperoni;
import Chapter4.pizzaTwo.ingredient.Spinach;
import Chapter4.pizzaTwo.ingredient.ThickCrustDough;
import Chapter4.pizzaTwo.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
    
}
