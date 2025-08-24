package OOPS._3_polymorphism;

/*
    toString() Method in Java
    -------------------------
    - Every class in Java inherits the toString() method from the Object class.
    - By default, toString() returns a string that includes the class name and hashcode.
    - Overriding toString() allows you to provide a custom string representation for your objects.
    - In this code, toString() is overridden to return the class name of the object using getClass().getName().
*/

public class Shape {
    void area(){
        System.out.println("I am in shapes");
    }

    public String toString(){
        return getClass().getName();
    }

    /*
        Using 'final' Methods in Java
        ----------------------------
        - In the code above, the 'display()' method in the Shape class is declared as 'final'.
        - This means that any subclass of Shape (such as Circle or Square) cannot override the 'display()' method.
        - The 'final' keyword is used to prevent modification of important methods, ensuring their behavior remains consistent across all subclasses.
        - This is useful for maintaining the integrity of core functionality and can also provide some performance optimizations.
        - Example:
            class Parent {
                final void show() {
                    System.out.println("This is a final method.");
                }
            }
            class Child extends Parent {
                // void show() { ... } // This would cause a compile-time error!
            }
    */

    final void display(){
        System.out.println("I am in shape");
    }

    static void static_method() {
        System.out.println("This is a static method in Shape.");
    }
}
