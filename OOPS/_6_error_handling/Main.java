package OOPS._6_error_handling;

public class Main {
    // In java we have a class called throwable
    public static void main(String[] args) {
        int a =5;
        int b=0;
        try {
            divide(a,b);
        } catch (Exception e) {
           System.out.println(e);
        }finally{
            System.out.println("RUNNNNNNNNNNNNNN");
        }    
    }


    static int divide(int a ,int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Please do not divide by 0");
        return a/b;
    }
}
