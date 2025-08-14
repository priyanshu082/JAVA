package OOPS.static_example;

// class Test{
//     static String name;

//     public Test(String name){
//         Test.name=name;
//     }
// }

public class InnerClasses {
    
    static class Test{
        String name;
    
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {

        Test t1 = new Test("yash");
        Test t2 = new Test("Riya");
        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
