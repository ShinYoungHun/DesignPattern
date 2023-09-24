package Chapter7.adapter1;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey Saying");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n Duck Saying");
        testDuck(duck);

        System.out.println("\n Turkey Adapter Saying");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
