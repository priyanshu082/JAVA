package OOPS._3_inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // Box box1= new Box(box);
        // System.out.println(box.h );
        // Box box2= new BoxWeight(0);
        // System.out.println(box2.weight); still not able to access the boxweight parameters
        // we will have access to only those methods and variables that are in the parent class
        // System.out.println(box2.h);

        Box box3 = new BoxWeight();
        System.out.println(box3);
        // In Java, you cannot explicitly "delete" an object like in C++ (no 'delete' keyword).
        // Objects are automatically deleted (garbage collected) when there are no more references to them.
        // To make an object eligible for garbage collection, remove all references to it:
        box3 = null; // Now the BoxWeight object previously referenced by box3 can be garbage collected

        // BoxWeight box3= new Box(); we cant do thsi it wll throw error
    }
}

/*
    ===========================
    All Theory About Inheritance in Java
    ===========================

    1. What is Inheritance?
    -----------------------
    Inheritance is one of the four fundamental Object-Oriented Programming (OOP) concepts (the others are Polymorphism, Encapsulation, and Abstraction).
    Inheritance allows a new class (child/subclass/derived class) to acquire the properties and behaviors (fields and methods) of an existing class (parent/superclass/base class).

    2. Why Use Inheritance?
    -----------------------
    - Promotes code reusability: Common code can be written in the parxent class and reused in child classes.
    - Supports hierarchical classification: Real-world relationships can be represented in code.
    - Enables method overriding and runtime polymorphism.

    3. Types of Inheritance in Java
    -------------------------------
    - Single Inheritance: A class inherits from one superclass.
    - Multilevel Inheritance: A class inherits from a class, which in turn inherits from another class.
    - Hierarchical Inheritance: Multiple classes inherit from a single superclass.
    - Java does NOT support multiple inheritance (a class cannot inherit from more than one class) to avoid ambiguity.

    4. Syntax
    ---------
        class Parent {
            // fields and methods
        }

        class Child extends Parent {
            // additional fields and methods
        }

    5. The 'super' Keyword
    ----------------------
    - Used to refer to the immediate parent class object.
    - Can be used to access parent class fields and methods, and to call the parent class constructor.

    6. Constructor Chaining
    -----------------------
    - When a child class object is created, the parent class constructor is called first.
    - This ensures that the parent part of the object is initialized before the child part.

    7. Method Overriding
    --------------------
    - A child class can provide its own implementation of a method defined in the parent class.
    - The overridden method in the child class must have the same signature as in the parent class.

    8. Access Modifiers and Inheritance
    -----------------------------------
    - private members of the parent class are not accessible in the child class.
    - protected and public members are accessible in the child class.
    - Default (package-private) members are accessible if the child class is in the same package.

    9. Object Class
    ---------------
    - In Java, every class implicitly inherits from the Object class if no other superclass is specified.

    10. Real-World Analogy
    ----------------------
    - Think of inheritance as a family tree: A child inherits characteristics from their parents.

    11. Example
    -----------
        class Animal {
            void eat() { System.out.println("Animal eats"); }
        }

        class Dog extends Animal {
            void bark() { System.out.println("Dog barks"); }
        }

        public class Main {
            public static void main(String[] args) {
                Dog d = new Dog();
                d.eat(); // Inherited from Animal
                d.bark(); // Defined in Dog
            }
        }

    12. Advantages of Inheritance
    -----------------------------
    - Reduces code duplication.
    - Improves code organization and readability.
    - Facilitates code maintenance and scalability.

    ===========================
    End of Inheritance Theory
    ===========================
*/
