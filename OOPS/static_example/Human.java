package OOPS.static_example;


public class Human {
    int age;
    int salary;
    String name;
    boolean married;

    //if there is property which is common to all objects of that class than that property is called static property

    static long population;

    static void message(){
        System.out.println("world is great");
        // System.out.println(this.age);  we cant use the instance variable in static method
    }
    public Human( int age, int salary, String name, boolean married) {
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;

        Human.population+=1;
    }
}
