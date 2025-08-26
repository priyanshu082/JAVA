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

    //for making the deep copy
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    //for making the shallow copy
    public Object clone() throws CloneNotSupportedException {
        Human cloned = (Human) super.clone();
        // Deep copy the arr array
        if (this.arr != null) {
            cloned.arr = new Human[this.arr.length];
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] != null) {
                    cloned.arr[i] = (Human) this.arr[i].clone();
                } else {
                    cloned.arr[i] = null;
                }
            }
        }
        return cloned;
    }


}
