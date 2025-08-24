package OOPS._4_access;

public class ObjectDemo {
    private int num;
    private float name;
    
    public ObjectDemo(int num, float name) {
        this.num = num;
        this.name = name;
    }
    
    // Getters
    public int getNum() {
        return num;
    }
    
    public float getName() {
        return name;
    }
    
    // Setters
    public void setNum(int num) {
        this.num = num;
    }
    
    public void setName(float name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectDemo that = (ObjectDemo) obj;
        return num == that.num && Float.compare(that.name, name) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        // Creating two ObjectDemo objects with the same data
        ObjectDemo obj1 = new ObjectDemo(45, 43.4f);
        ObjectDemo obj2 = new ObjectDemo(45, 43.4f);

        // Theory:
        // In Java, '==' checks whether two reference variables point to the same object in memory (reference equality).
        // It does NOT compare the contents of the objects.
        // Here, obj1 and obj2 are two different objects (different memory locations), so (obj1 == obj2) will be false.
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are same");
        }

        // The equals() method is used to check logical equality (whether the contents of the objects are the same).
        // By default, equals() in Object class behaves like '==', so unless we override equals(), it will also check reference equality.
        // In this code, equals() is now properly overridden to compare fields, so (obj1.equals(obj2)) will be true.
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 are same");
        }

        // Summary:
        // - '==' checks if both references point to the same object (reference equality).
        // - equals() checks for logical equality, and now properly compares the actual data.
        // - To compare the actual data inside objects, override the equals() method in your class.
        
        // Further we can get data of the object 
        // It is a final method so we can't override it
        System.out.println(obj1.getClass());
    }
}
