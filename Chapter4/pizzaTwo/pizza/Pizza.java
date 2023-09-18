package Chapter4.pizzaTwo.pizza;

import java.util.ArrayList;
import java.util.List;

import Chapter4.pizzaTwo.ingredient.Cheese;
import Chapter4.pizzaTwo.ingredient.Clams;
import Chapter4.pizzaTwo.ingredient.Dough;
import Chapter4.pizzaTwo.ingredient.Pepperoni;
import Chapter4.pizzaTwo.ingredient.Sauce;
import Chapter4.pizzaTwo.ingredient.Veggies;

public abstract class Pizza {

    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    List<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }

    public void box(){
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "";
    }

}
