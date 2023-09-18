package Chapter5.chocolate.enums;

public class ChocolateController {
    
    public static void main(String args[]){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.UNIQUE_INSTANCE;
        System.out.println(chocolateBoiler);
        chocolateBoiler.boil();
        
    }

}
