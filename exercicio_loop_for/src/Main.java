import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<num; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}