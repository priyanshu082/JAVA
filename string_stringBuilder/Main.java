package string_stringBuilder;

public class Main {
    public static void main(String[] args) {
        //they both will be in the same string pool pointing to the same object at the time 
        String a = "priyanshu";
        String b = "priyanshu";

        // Both 'a' and 'b' refer to the same String object in the string pool.
        // Strings in Java are immutable, meaning you cannot change the value of a String object once it is created.
        // If you want to modify a string, you need to create a new String object.

        System.out.println(a); // Output: priyanshu

        //the == comparator compare values and mainly the reference; if the reference is same then it will return true;
        System.out.println(a == b); // Output: true

        //here we have created a separate object
        a = "kunal";
        System.out.println(b == a); // Output: false

        //how to create diff objects with same value
        String c = new String("Priyanshu");
        String d = new String("Priyanshu");
        // now if we do c==d it will give false
        System.out.println(c == d); // Output: false

        //it will compare the value and return answer based on that
        System.out.println(c.equals(d)); // Output: true

        //for accessing the character at particular index 
        System.out.println(c.charAt(4)); // Output: a

        //prettier print
        // System.out.printf("Hey my name is %s and %s","Priyanshu" , "code");

        System.out.println('a'); // Output: a
        System.out.println('b'); // Output: b
        System.out.println('a' + 'b'); // Output: 195
    }
}
