package OOPS.static_example;

public class staticBlock {
        static int a=4;
        static int b;

        //now we want to initalize our static variables
        //we do this using static block
        // it will only be called once when first object is created

        static{
            System.out.println("I am in static block");
            b=a*5;
        }

        public static void main(String[] args) {
            staticBlock obj= new staticBlock();
            System.out.println(staticBlock.a+ " " + staticBlock.b);

            staticBlock.b+=3;

            staticBlock  obj2= new staticBlock();
            System.out.println(staticBlock.a+ " " + staticBlock.b);

        }
}
