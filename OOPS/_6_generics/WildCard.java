package OOPS._6_generics;

// This generic class only accepts types that are subclasses of Number (e.g., Integer, Double, etc.)

//here T should either be numbers or subclasses of numbers
//it allows us create specific type of generics
public class WildCard<T extends Number> {

    // We use Object[] here because Java does not allow the direct creation of generic arrays (e.g., new T[]).
    // By using Object[], we can store any type of object, and then cast to T when retrieving elements.
    // This is a common workaround for type erasure limitations in Java generics.
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    
    // Note: We cannot create a static generic in generics.
    // For example, if we have a generic class for OS and we create different objects for Mobile, Laptop, etc.,
    // we cannot have a static generic variable that is shared among all types.
    // Similarly, we cannot create a generic array directly due to type erasure.

   
    public WildCard(){
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T data){
        if (isFull()) resize();

        this.data[size++] = data; 
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        Object[] temp=new Object[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public void remove(){
        size--;  
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = element;
    }

    private boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        GenArrayList<String> stringList = new GenArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        GenArrayList<Integer> intList = new GenArrayList<>();
        intList.add(10);
        intList.add(20);

        System.out.println("String List:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("Integer List:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }


}

