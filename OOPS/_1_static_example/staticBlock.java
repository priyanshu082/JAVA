package OOPS._1_static_example;

public class staticBlock {
        static int a = 4; // static variable, shared by all instances
        static int b;     // static variable, will be initialized in static block

        // Static block to initialize static variables
        // This block runs only once, when the class is loaded
        static {
            System.out.println("I am in static block");
            b = a * 5;
        }

        public static void main(String[] args) {
            staticBlock obj;
            obj = new staticBlock(); // creating first object, static block already executed
            System.out.println(staticBlock.a + " " + staticBlock.b); // prints values of static variables

            staticBlock.b += 3; // modify static variable b

            staticBlock obj2 = new staticBlock(); // creating second object, static block will NOT execute again
            System.out.println(staticBlock.a + " " + staticBlock.b); // prints updated values of static variables
        }
}
