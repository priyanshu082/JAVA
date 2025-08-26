package OOPS._6_cloning;

public class Human implements Cloneable {
    int age;
    String name;
    Human[] arr;

    Human(int age, String name){
        this.age = age;
        this.name = name;
        // Create some Human objects for the arr field
        this.arr = new Human[2];
        this.arr[0] = new Human(20, "Alice");
        this.arr[1] = new Human(25, "Bob");
    }

    Human(Human other){
        this.age = other.age;
        this.name = other.name;
        // Copy the arr reference (shallow copy)
        this.arr = other.arr;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
