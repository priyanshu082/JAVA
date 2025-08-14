package OOPS.polymorphism;

public class Triangle extends Shape{
    void area(){
        System.out.println("Area is 1/2 * base * height");
    }

    /*
        Why can't we override the 'display()' method in Triangle?

        In Java, if a method in a superclass is declared as 'final', it cannot be overridden by any subclass.
        In our code, the 'display()' method in the Shape class is marked as 'final':
        
            final void display() {
                System.out.println("I am in shape");
            }

        This means that any subclass of Shape (such as Triangle, Circle, or Square) is not allowed to provide its own implementation of the 'display()' method.
        Attempting to do so will result in a compile-time error: "Cannot override the final method from Shape".

        The 'final' keyword is used to prevent modification of important methods, ensuring their behavior remains consistent across all subclasses.
        This helps maintain the integrity of the code and prevents accidental changes to core functionality.
    */
    // void display() {
    //     System.out.println("I am in Triangle");
    // }


    // @Override cnt override this 
    static void static_method(){
        System.out.println("This is a static method in triangle");
    }
}
