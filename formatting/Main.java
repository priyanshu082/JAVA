package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        NumberFormat currecyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentage = NumberFormat.getPercentInstance(Locale.US);

        System.out.println("Salary : "+ currecyFormat.format(100000));
        System.out.println("Salary : "+ percentage.format(10));
    }
    
}
