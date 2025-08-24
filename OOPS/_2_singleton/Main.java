package OOPS._2_singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); will throw error
        // Singleton singleto2s = new Singleton();
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }

    
}
