package OOPS;

public class Wrapper_class {
    
public static void main(String[] args) {
    //whether you do 
    int a=10;
    int b=20;
    swap(a,b);
    System.out.println(a+ " "+b);


    //or you can do 
    Integer c=20;
    Integer d=30; //since it is a final class so it cant be modified once assing 
    swap(c,d);
    System.out.println(c+" "+d); //still not working because of pass by value

    // final int bonus=10;
    // bonus=20; will error cant change


}

 static void swap(int a, int b){
    int temp=a;
    a=b;
    b=temp;
}
    

}
