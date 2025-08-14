package OOPS.inheritance;

/*
    ===========================
    All Theory About Inheritance
    ===========================

    1. What is Inheritance?
    -----------------------
    Inheritance is one of the four fundamental Object-Oriented Programming (OOP) concepts (the others are Encapsulation, Polymorphism, and Abstraction).
    Inheritance allows a new class (called the subclass or child class) to acquire the properties and behaviors (fields and methods) of an existing class (called the superclass or parent class).
    This promotes code reusability, logical hierarchy, and easier maintenance.

    2. Types of Inheritance in Java
    -------------------------------
    - Single Inheritance: A class inherits from one superclass.
    - Multilevel Inheritance: A class inherits from a subclass, which in turn inherits from another class.
    - Hierarchical Inheritance: Multiple classes inherit from a single superclass.
    - Java does NOT support multiple inheritance (a class inheriting from more than one class) directly to avoid ambiguity, but it can be achieved using interfaces.

    3. Syntax of Inheritance
    ------------------------
    In Java, inheritance is implemented using the 'extends' keyword:
        class Parent {
            // fields and methods
        }

        class Child extends Parent {
            // additional fields and methods
        }

    4. Access Modifiers and Inheritance
    -----------------------------------
    - public: Members are accessible everywhere.
    - protected: Members are accessible within the same package and subclasses.
    - default (no modifier): Members are accessible within the same package.
    - private: Members are NOT accessible in subclasses.

    5. Constructors and Inheritance
    -------------------------------
    - Constructors are NOT inherited.
    - The subclass constructor can call the superclass constructor using 'super()'.
    - If the superclass does not have a no-argument constructor, the subclass must explicitly call a superclass constructor.

    6. Method Overriding
    --------------------
    - A subclass can provide a specific implementation of a method already defined in its superclass.
    - The method signature must be the same.
    - The '@Override' annotation is used for clarity.

    7. The 'super' Keyword
    ----------------------
    - Used to refer to the immediate parent class object.
    - Can be used to access superclass methods and fields, and to call the superclass constructor.

    8. The 'Object' Class
    ---------------------
    - Every class in Java implicitly extends the 'Object' class if no other superclass is specified.
    - 'Object' provides basic methods like toString(), equals(), hashCode(), etc.

    9. IS-A Relationship
    --------------------
    - Inheritance represents an IS-A relationship.
    - Example: A Dog IS-A Animal.

    10. Advantages of Inheritance
    -----------------------------
    - Code reusability: Common code is written in the superclass and reused in subclasses.
    - Method overriding: Subclasses can provide specific implementations.
    - Polymorphism: Enables dynamic method dispatch.

    11. Disadvantages of Inheritance
    --------------------------------
    - Tight coupling between superclass and subclass.
    - Changes in superclass can affect subclasses.
    - Can lead to complexity if overused.

    12. Example
    -----------
        class Animal {
            void eat() { System.out.println("eating..."); }
        }

        class Dog extends Animal {
            void bark() { System.out.println("barking..."); }
        }

        // Dog inherits eat() from Animal

    13. Final Keyword and Inheritance
    ---------------------------------
    - If a class is declared as 'final', it cannot be subclassed.
    - If a method is declared as 'final', it cannot be overridden.

    14. Abstract Classes and Inheritance
    ------------------------------------
    - Abstract classes cannot be instantiated.
    - Subclasses must implement abstract methods of the superclass.

    15. Interfaces and Inheritance
    ------------------------------
    - Java supports multiple inheritance of type via interfaces.
    - A class can implement multiple interfaces.

    16. Hierarchy Example
    ---------------------
        Object
          |
        Animal
          |
        Dog

    17. Real-World Analogy
    ----------------------
    - Think of inheritance like a family tree: children inherit traits from their parents.

    18. When Not to Use Inheritance
    -------------------------------
    - If the relationship is not IS-A.
    - Prefer composition over inheritance when possible.

    ===========================
    End of Inheritance Theory
    ===========================
*/

// Example code demonstrating inheritance in Java:

public class BoxWeight extends Box {
    double weight;

    // Constructor that sets weight, but sets inherited dimensions to -1
    public BoxWeight(double weight) {
        // Calls the default constructor of Box (super()), which sets l, w, h to -1
        super();
        this.weight = -1;
    }

    // Constructor that sets all dimensions and weight
    public BoxWeight(double weight, double height, double width, double depth) {
        // Calls the parameterized constructor of Box to set l, w, h
        super(width, depth, height); // l=width, w=depth, h=height
        this.weight = weight;
        // Note: We can access protected/public members of the parent class directly,
        // but not private members.
    }
}

/*
    // Example usage:
    BoxWeight box = new BoxWeight(10, 2, 3, 4);
    System.out.println(box.l); // inherited from Box
    System.out.println(box.weight); // from BoxWeight
*/
