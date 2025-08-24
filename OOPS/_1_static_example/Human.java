package OOPS._1_static_example;

public class Human {
    private int age;
    private int salary;
    private String name;
    private boolean married;

    // If there is property which is common to all objects of that class than that property is called static property
    static long population;

    public static void message() {
        System.out.println("world is great");
        // System.out.println(this.age);  we cant use the instance variable in static method
    }
    
    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;

        Human.population += 1;
    }
    
    // Getters
    public int getAge() {
        return age;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isMarried() {
        return married;
    }
    
    // Setters
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMarried(boolean married) {
        this.married = married;
    }
    
    // Static getter for population
    public static long getPopulation() {
        return population;
    }
}
