package Chapter5.singleton.stat;

public class Singleton {

    // 클래스가 로딩될 때 JVM 에서 Singleton의 하나뿐인 인스턴스를 생성함
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;
    }

}
