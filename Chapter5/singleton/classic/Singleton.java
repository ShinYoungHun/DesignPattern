package Chapter5.singleton.classic;

public class Singleton {

    private static Singleton uniqueInstance; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수

    private Singleton(){ // 생성자를 private으로 선언했으므로 Singleton에서만 클래스 인스턴스 만들 수 있음

    }

    public static Singleton getInstance(){ // 클래스의 인스턴스를 만들어서 리턴
        if (null == uniqueInstance) {
            uniqueInstance = new Singleton();
            /**
             * 인스턴스가 만들어지지 않았으면 private으로 선언된 생성자를 사용해서 
             * Singleton 객체 생성 후 uniqueInstance 에 대입
             * 인스턴스가 필요한 상황이 발생하기 전까지 인스턴스 생성하지 않음
             * 게이른 인스턴스 생성(lazyinstantiation) 이라 부름
             */
        }
        return uniqueInstance;
    }
}