package OOPS._3_inheritance;

public class Box {
    private double l;
    private double w;
    private double h;

    public Box() {
        l = -1;
        w = -1;
        h = -1;
    }

    public Box(double side) {
        l = w = h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box ob) {
        this.l = ob.l;
        this.w = ob.w;
        this.h = ob.h;
    }
    
    // Getters
    public double getL() {
        return l;
    }
    
    public double getW() {
        return w;
    }
    
    public double getH() {
        return h;
    }
    
    // Setters
    public void setL(double l) {
        this.l = l;
    }
    
    public void setW(double w) {
        this.w = w;
    }
    
    public void setH(double h) {
        this.h = h;
    }
    
    // Method to calculate volume
    public double getVolume() {
        return l * w * h;
    }
}
