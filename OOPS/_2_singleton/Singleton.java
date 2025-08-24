package OOPS._2_singleton;

public class Singleton {
    private Singleton(){
        System.out.println("Only one instance is created");
    }

    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            return instance = new Singleton();
        }else{
            return instance;
        }
    }
}
