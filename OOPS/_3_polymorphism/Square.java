package OOPS._3_polymorphism;

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public void area() {
        System.out.println("Square area: " + (side * side));
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
}
