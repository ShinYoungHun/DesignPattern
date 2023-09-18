package Chapter5.chocolate.enums;

public enum ChocolateBoiler {

    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("fill empty : "+empty+" boiled : "+boiled);
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
            System.out.println("drain empty : "+empty+" boiled : "+boiled);
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // 재료를 끓임
            boiled = true;
            System.out.println("boil empty : "+empty+" boiled : "+boiled);
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

}
