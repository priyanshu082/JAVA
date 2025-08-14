package OOPS.polymorphism;

public class Main {
public static void main(String[] args) {
    Shape shape= new Shape();
    Shape circle= new Circle();
    Square square= new Square();
    Triangle triangle= new Triangle();
    Shape triangle2= new Triangle();

    shape.area();
    circle.area();
    square.area();

    // Demonstrating the use of the overridden toString() method in Shape and its subclasses.
    // When we print an object, Java calls its toString() method.
    // Since we have overridden toString() in Shape, it will print the class name for each object.
    System.out.println(shape);   // Output: OOPS.polymorphism.Shape
    System.out.println(circle);  // Output: OOPS.polymorphism.Circle
    System.out.println(square);  // Output: OOPS.polymorphism.Square

    // Demonstrating static method calls.
    // Note: Static methods are not overridden, they are hidden.
    // The method called depends on the reference type, not the object type.
    // Both of these will call Triangle.static_method() because the reference is Triangle.
    triangle.static_method();
    triangle2.static_method(); // Even though triangle2 is of type Shape, static methods are resolved at compile time based on reference type.
}
}

/*
    ===========================
    All Theory About Polymorphism
    ===========================

    1. What is Polymorphism?
    ------------------------
    Polymorphism is one of the four fundamental Object-Oriented Programming (OOP) concepts (the others are Inheritance, Encapsulation, and Abstraction).
    The word "polymorphism" means "many forms". In Java, it allows objects to be treated as instances of their parent class rather than their actual class.
    The most common use of polymorphism is when a parent class reference is used to refer to a child class object.

    2. Types of Polymorphism in Java
    --------------------------------
    - Compile-time Polymorphism (Static Polymorphism): Achieved by method overloading.
    - Runtime Polymorphism (Dynamic Polymorphism): Achieved by method overriding.

    3. Method Overloading (Compile-time Polymorphism)
    -------------------------------------------------
    - Multiple methods in the same class have the same name but different parameters (different type, number, or order).
    - The method to be executed is determined at compile time.
    Example:
        void show(int a) { ... }
        void show(String s) { ... }

    4. Method Overriding (Runtime Polymorphism)
    -------------------------------------------
    - A subclass provides a specific implementation of a method already defined in its superclass.
    - The method to be executed is determined at runtime based on the object type.
    Example:
        class Animal { void sound() { System.out.println("Animal sound"); } }
        class Dog extends Animal { void sound() { System.out.println("Bark"); } }

        Animal obj = new Dog();
        obj.sound(); // Output: Bark

    5. Upcasting and Downcasting
    ----------------------------
    - Upcasting: Assigning a child object to a parent reference (allowed implicitly).
        Animal a = new Dog();
    - Downcasting: Assigning a parent reference to a child reference (requires explicit cast and is not always safe).
        Dog d = (Dog) a;

    6. Why Use Polymorphism?
    ------------------------
    - Code reusability and flexibility.
    - Allows writing more generic and extensible code.
    - Enables dynamic method dispatch.

    7. Dynamic Method Dispatch
    -------------------------
    - The process by which a call to an overridden method is resolved at runtime rather than compile time.
    - Enables Java to support runtime polymorphism.

    8. Polymorphism with Interfaces and Abstract Classes
    ---------------------------------------------------
    - Interfaces and abstract classes are used to achieve polymorphism.
    - A reference variable of an interface or abstract class can point to objects of classes that implement/extend them.

    9. Real-World Analogy
    ---------------------
    - A person behaves differently in different situations: as a student in school, as a child at home, as a player on the field.
    - The same person (reference) exhibits different behaviors (forms) depending on the context (object).

    10. Advantages of Polymorphism
    ------------------------------
    - Reduces coupling between different functionalities.
    - Increases code reusability and maintainability.
    - Makes code easier to extend and modify.

    11. Example in This Project
    ---------------------------
    - The Shape class has a method area().
    - Circle, Square, and Triangle classes override the area() method.
    - A Shape reference can point to any subclass object, and the correct area() method is called at runtime.

    Example:
        Shape s;
        s = new Circle();
        s.area(); // Calls Circle's area()
        s = new Square();
        s.area(); // Calls Square's area()

    ===========================
    End of Polymorphism Theory
    ===========================
*/

