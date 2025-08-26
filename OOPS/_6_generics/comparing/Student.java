package OOPS._6_generics.comparing;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // @Override
    // public String toString() {
    //     return "Student{rollNo=" + rollNo + ", name='" + name + "', marks=" + marks + "}";
    // }
    @Override
    public String toString() {
        return name + ":" +marks;
    }

    @Override
    public int compareTo(Student o) {
       
        int diff=(int)this.marks-o.marks;
        // return -diff; //decending order
        return diff; //ascending order
    }
}