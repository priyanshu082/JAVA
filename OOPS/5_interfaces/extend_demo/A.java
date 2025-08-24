package OOPS.interfaces.extend_demo;

public interface A {
    //static methods cant be overirdden so we need have to body here for that
    static void m(){
        System.out.println("HEy , I am static method");
    }
    void fun();
}
