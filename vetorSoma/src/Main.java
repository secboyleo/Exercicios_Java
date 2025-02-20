import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0.0;

        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        for (double i : vect) {
            System.out.print(i + " ");
            soma += i;
        }

        double avr = soma / n;
        System.out.println(" ");
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + avr);

        sc.close();
    }
}
