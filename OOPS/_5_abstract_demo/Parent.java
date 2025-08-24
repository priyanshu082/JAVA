package OOPS._5_abstract_demo;

public abstract class Parent {
    abstract void career(String name);
    abstract void patner(String name);

    public Parent(){
        System.out.println("parent class");
    }  

    // but we can create static methods in the abstract classes as they do not get overriden
    static void hello(){
        System.out.println("Hello from parent");
    }

    void normal(){
        System.out.println("Normal methods can be made in asbtract classes");
    }

}
