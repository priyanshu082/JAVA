package OOPS;

class Animal {
    Animal(){
        System.out.println("animal");
    }
    Animal(String s){
        System.out.println("Animal :- "+s);
    }
}

class Dog extends Animal{

    Dog() {
        System.out.println("Dog constructor");
    }
    
}
public class Main {
 public static void main(String[] args) {
    // When you do:
    Dog d = new Dog();
    // - This creates a Dog object and assigns it to a Dog reference.
    // - You can access all methods and fields of Dog (including those inherited from Animal).

    Animal d2 = new Dog();
    // - This also creates a Dog object, but assigns it to an Animal reference.
    // - You can only access methods and fields defined in Animal (unless overridden in Dog).
    // - This is useful for polymorphism: you can treat all subclasses as their parent type.

    // Both lines will call the Animal constructor first, then the Dog constructor,
    // but the reference type determines what members you can access.
 }
}
