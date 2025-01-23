import java.util.Locale;

public class Main{
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5990;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.645789;

        System.out.printf("Products: %n%s, which price is $%.1f %n%s which price is %.2f %n %nRecord: %d years old, code %d and gender: %s %n%n", product1, price1, product2, price2, age, code, gender);
        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal Point: %.3f", measure);

    }
}