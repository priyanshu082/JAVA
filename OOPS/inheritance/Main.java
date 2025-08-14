package OOPS.inheritance;



public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1= new Box(box);
        System.out.println(box.h );
        Box box2= new BoxWeight(0);
        // System.out.println(box2.weight); still not able to access the boxweight parameters
        // we will have access to only those methods and variables that are in the parent class
        System.out.println(box2.h);

        // BoxWeight box3= new Box(); we cant do thsi it wll throw error
    }
}
