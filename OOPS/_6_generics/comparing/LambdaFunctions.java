package OOPS._6_generics.comparing;
import java.util.ArrayList;

/**
 * Demonstrates the use of lambda functions in Java.
 * Shows how to use lambdas with collections and functional interfaces.
 */
public class LambdaFunctions {
    public static void main(String[] args) {
        // Create an ArrayList of integers and add numbers 1 to 5
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // Use a lambda expression to print each element multiplied by 2
        arr.forEach((item) -> {
            System.out.println(item * 2);
        });

        // Define lambda expressions for different operations using the Operations interface
        Operations sum = (a, b) -> a + b;      // Lambda for addition
        Operations prod = (a, b) -> a * b;     // Lambda for multiplication
        Operations sub = (a, b) -> a - b;      // Lambda for subtraction

        // Create an instance of LambdaFunctions to use the operate method
        LambdaFunctions myCal = new LambdaFunctions();

        // Use the operate method with different operations and print the results
        System.out.println(myCal.operate(2, 3, sum));   // Output: 5
        System.out.println(myCal.operate(2, 3, prod));  // Output: 6
        System.out.println(myCal.operate(2, 3, sub));   // Output: -1
    }

   
    private int operate(int a, int b, Operations op) {
        return op.op(a, b);
    }
}

/**
 * Functional interface representing an operation on two integers.
 */
interface Operations {
    int op(int a, int b);
}