package OOPS.abstract_demo;

public class Main {
    public static void main(String[] args) {
        Son son= new Son();
        // Parent parent = new Parent(); // we can't create the objects of abstract classes
        
        son.career("oskfosdo");
        Parent.hello();
        // Parent.normal();   we cannot access it like this becuase normal is a non static method and non static methods belgons to the objects not the class

        Parent son2 = new Son(); // We can't create an object of the abstract class Parent, but we can use a Parent reference to refer to a Son object
        son2.normal();
        
    }
    
}
