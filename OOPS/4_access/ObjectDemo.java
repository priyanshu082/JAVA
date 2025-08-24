package OOPS.access;

public class ObjectDemo {
    int num ;
    float name;
     public ObjectDemo(int num ,float name){
        this.num=num;
        this.name=name;
     }
        @Override
        public int hashCode(){
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj){
            return super.equals(obj);
        }

        // @Override


        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String[] args) {
            // Creating two ObjectDemo objects with the same data
            ObjectDemo obj1 = new ObjectDemo(45,43.4f);
            ObjectDemo obj2 = new ObjectDemo(45,43.4f);

            // Theory:
            // In Java, '==' checks whether two reference variables point to the same object in memory (reference equality).
            // It does NOT compare the contents of the objects.
            // Here, obj1 and obj2 are two different objects (different memory locations), so (obj1 == obj2) will be false.
            if(obj1==obj2){
                System.out.println("obj1 and obj2 are same");
            }

            // The equals() method is used to check logical equality (whether the contents of the objects are the same).
            // By default, equals() in Object class behaves like '==', so unless we override equals(), it will also check reference equality.
            // In this code, equals() is not overridden to compare fields, so (obj1.equals(obj2)) will also be false.
            if(obj1.equals(obj2))  System.out.println("obj1 and obj2 are same");

            // Summary:
            // - '==' checks if both references point to the same object (reference equality).
            // - equals() checks for logical equality, but by default, it also checks reference equality unless overridden.
            // - To compare the actual data inside objects, override the equals() method in your class.
            // System.out.println(obj1.hashCode());
            

            //further we can get data of the object 
            //it is a final method so we can't override it
            System.out.println(obj1.getClass());
        }
}
