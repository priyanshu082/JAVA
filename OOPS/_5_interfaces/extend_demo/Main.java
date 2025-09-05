package OOPS._5_interfaces.extend_demo;

public class Main implements B {
    @Override
    public void fun() {}

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        // Main m = new Main();
        A.m(); //static methods are called by the name of the class
    }
}
