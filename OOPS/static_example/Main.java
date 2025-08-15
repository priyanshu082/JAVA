package OOPS.static_example;

public class Main {
    public static void main(String[] args) {
        // Static variables are shared by all instances of a class
        Human kunal = new Human(32, 10000, "Kunal", false);
        Human rahul = new Human(12, 100000, "Rahul", true);

        // In the Human class, the static variable is shared by both objects
        // We have initialized the static variable 
        System.out.println(Human.population);

        // For using anything static in a class, we need to use the static keyword before the method or variable
        b = 10;

        // To call a non-static method, we need to create an instance
        Main jj = new Main();
        jj.greeting();
    }

    // int b=10; // error: cannot make a non-static reference from a static context
    static int b = 10;

    void greeting() {
        System.out.println("Hello");
        greet2(); // can use this as this is not static so we can use the non-static method in another non-static method
    }

    void greet2() {
        System.out.println("How are you");
        // greeting();
    }
}

/*
    ===========================
    All Theory About Static in Java
    ===========================

    1. What is 'static' in Java?
    ---------------------------
    - The 'static' keyword in Java is used for memory management.
    - It can be applied to variables, methods, blocks, and nested classes.
    - Static members belong to the class rather than to any specific instance.

    2. Static Variables
    -------------------
    - Also known as class variables.
    - Shared among all instances of a class.
    - Initialized only once, at the start of program execution.
    - Accessed using the class name (e.g., ClassName.variable).

    3. Static Methods
    -----------------
    - Belong to the class, not to any object.
    - Can be called without creating an instance of the class.
    - Can only access static data and call other static methods.
    - Cannot refer to 'this' or 'super' keywords.

    4. Static Blocks
    ----------------
    - Used for static initializations of a class.
    - Runs only once, when the class is loaded into memory.
    - Useful for initializing static variables.

    5. Static Classes
    -----------------
    - Only nested classes can be static.
    - A static nested class cannot access non-static members of the outer class.

    6. Why Use Static?
    ------------------
    - To save memory, as static members are shared among all objects.
    - For utility or helper methods that do not require any object state.

    7. Example:
    -----------
        class Example {
            static int count = 0;
            Example() {
                count++;
            }
            static void showCount() {
                System.out.println(count);
            }
        }

        public class Test {
            public static void main(String[] args) {
                Example a = new Example();
                Example b = new Example();
                Example.showCount(); // Output: 2
            }
        }
*/
