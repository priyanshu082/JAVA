package OOPS._6_cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal");
        
        Human twin = (Human)kunal.clone();

        System.out.println(twin.age + twin.name);
    }
}
