package OOPS.static_example;
import OOPS.static_example.Human;


public class Main {
    public static void main(String[] args) {
        // Static variables are shared by all instances of a class
        Human kunal=new Human(32,10000,"Kunal",false);
        Human rahul=new Human(12,100000,"Rahul",true);
        System.out.println(Human.population);

        //for using anything in static class we need to use static word before the method
        b=10;

        //to call nons static we in the last need a static method
        Main jj = new Main();
        jj.greeting();
    }
    // int b=10; error
    static int b=10;

    void greeting(){
        System.out.println("Hello");
        greet2();//can use this as this is not  static so we can use the non static method in static method
    }

    void greet2(){
        System.out.println("How are you");
        // greeting();
    }
}
