package OOPS._5_abstract_demo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        // Parent parent = new Parent(); // we can't create the objects of abstract classes

        son.career("oskfosdo");
        Parent.hello();
        // Parent.normal();   we cannot access it like this because normal is a non-static method and non-static methods belong to the objects, not the class

        Parent son2 = new Son(); // We can't create an object of the abstract class Parent, but we can use a Parent reference to refer to a Son object
        son2.normal();
    }
}

/*
    ===========================
    All Theory About Abstract Classes
    ===========================

    1. What is an Abstract Class?
    -----------------------------
    - An abstract class in Java is a class that cannot be instantiated (you cannot create objects of it).
    - It is declared using the 'abstract' keyword.
    - Abstract classes can have abstract methods (methods without a body) as well as concrete methods (methods with a body).

    2. Abstract Methods
    -------------------
    - An abstract method is a method that is declared without an implementation (no method body).
    - Any class that contains at least one abstract method must be declared abstract.
    - Subclasses of the abstract class must provide implementations for all abstract methods, unless they are also abstract.

    3. Why Use Abstract Classes?
    ----------------------------
    - To provide a common base for other classes.
    - To enforce certain methods to be implemented by subclasses.
    - To achieve partial abstraction (unlike interfaces, which provide 100% abstraction).

    4. Key Points
    -------------
    - Abstract classes can have constructors, fields, and methods (both abstract and concrete).
    - You cannot create an object of an abstract class directly.
    - Abstract classes can have static methods.
    - A reference of an abstract class can point to an object of its subclass (polymorphism).

    5. Example
    ----------
        abstract class Parent {
            abstract void career(String name);
            void normal() {
                System.out.println("This is a normal method in abstract class.");
            }
            static void hello() {
                System.out.println("Hello from abstract class.");
            }
        }

        class Son extends Parent {
            @Override
            void career(String name) {
                System.out.println("Son's career: " + name);
            }
        }

        public class Main {
            public static void main(String[] args) {
                // Parent p = new Parent(); // Not allowed
                Son son = new Son();
                son.career("Engineer");
                Parent.hello();
                Parent ref = new Son();
                ref.normal();
            }
        }

    6. Abstract Class vs Interface
    ------------------------------
    - Abstract classes can have both abstract and concrete methods; interfaces (prior to Java 8) could only have abstract methods.
    - A class can extend only one abstract class but can implement multiple interfaces.
    - Abstract classes can have constructors and state (fields), interfaces cannot (except static final fields).

    7. Real-World Analogy
    ---------------------
    - Think of an abstract class as a blueprint for houses. You can't build a "blueprint" house, but you can build houses (subclasses) based on the blueprint, each with its own details.

    ===========================
    End of Abstract Theory
    ===========================
*/
