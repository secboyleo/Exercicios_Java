import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor >>>");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n ; i++){
            System.out.print("Valor da posicao " + i + " do vetor:");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i=0; i<n ; i++){
            sum += vect[i];
        }

        double avr = sum / n;
        System.out.printf("AVERAGE HEIGHT = %.2f%n", avr);

        sc.close();
    }
}
