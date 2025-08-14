package OOPS.static_example;


public class Main {
    public static void main(String[] args) {
        // Static variables are shared by all instances of a class
        Human kunal=new Human(32,10000,"Kunal",false);
        Human rahul=new Human(12,100000,"Rahul",true);
        
        //in that human class static variable is shared by both the objects
        //we have initialized the static variable 
        System.out.println(Human.population);

        //for using anything in static class we need to use static word before the method
        b=10;

        //to call non static method in the last we need a static method
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
