package OOPS.inheritance;



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
