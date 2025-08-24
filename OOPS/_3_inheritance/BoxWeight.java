package OOPS._3_inheritance;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super();
        System.out.println("BoxWeight Created");
    }

    // Constructor that sets weight, but sets inherited dimensions to -1
    public BoxWeight(double weight) {
        // Calls the default constructor of Box (super()), which sets l, w, h to -1
        super();
        this.weight = weight;
    }

    // Constructor that sets all dimensions and weight
    public BoxWeight(double weight, double height, double width, double depth) {
        // Calls the parameterized constructor of Box to set l, w, h
        super(width, depth, height); // l=width, w=depth, h=height
        this.weight = weight;
        // Note: We can access protected/public members of the parent class directly,
        // but not private members.
    }
    
    // Getter and setter for weight
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Method to calculate density (weight/volume)
    public double getDensity() {
        return weight / getVolume();
    }
}
