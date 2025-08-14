package OOPS.polymorphism;

// The Circle class extends Shape, demonstrating inheritance.
// It overrides the area() method to provide a specific implementation for circles.
public class Circle extends Shape {
    // This annotation indicates that we are overriding the area() method from the parent class.
    @Override
    void area(){
        // Prints the formula for the area of a circle.
        System.out.println("Area is pie * r * r");
    }
}
