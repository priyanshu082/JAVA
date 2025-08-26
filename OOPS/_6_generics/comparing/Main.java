package OOPS._6_generics.comparing;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 85);
        Student student2 = new Student(2, "Bob", 92);

        System.out.println(student1);
        System.out.println(student2);

        // Use compareTo to compare students by marks (descending order)
        int diff = student1.compareTo(student2);
        
        System.out.println("Difference in marks (student1 - student2): " + diff);

        if (diff < 0) {
            System.out.println(student2 + " has higher marks.");
        } else if (diff > 0) {
            System.out.println(student1 + " has higher marks.");
        } else {
            System.out.println("Both students have equal marks.");
        }

        // Create a list of 10 students below the already written code
        Student[] students = new Student[] {
            new Student(1, "Alice", 85),
            new Student(2, "Bob", 92),
            new Student(3, "Charlie", 78),
            new Student(4, "David", 88),
            new Student(5, "Eve", 95),
            new Student(6, "Frank", 67),
            new Student(7, "Grace", 80),
            new Student(8, "Hannah", 90),
            new Student(9, "Ivy", 73),
            new Student(10, "Jack", 85)
        };

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }
}
