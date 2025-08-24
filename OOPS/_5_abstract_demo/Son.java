package OOPS._5_abstract_demo;

public class Son extends Parent {

    Son(){
        System.out.println("Hello from Son");
    }
    
    @Override
    void career(String name) {
        System.out.println(name);
    }

    @Override
    void patner(String name) {
        
       
    }
    
}
