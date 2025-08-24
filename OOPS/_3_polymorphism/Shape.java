package OOPS._3_polymorphism;

public class Shape {
    public void area() {
        System.out.println("I am in shapes");
    }

    @Override
    public String toString() {
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

    public final void display() {
        System.out.println("I am in shape");
    }

    public static void static_method() {
        System.out.println("This is a static method in Shape.");
    }
}
