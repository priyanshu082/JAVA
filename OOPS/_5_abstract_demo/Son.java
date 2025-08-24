package OOPS._5_abstract_demo;

public class Son extends Parent {

    public Son() {
        System.out.println("Hello from Son");
    }
    
    @Override
    void career(String name) {
        System.out.println("Son's career: " + name);
    }

    @Override
    void patner(String name) {
        System.out.println("Son's partner: " + name);
    }
}
