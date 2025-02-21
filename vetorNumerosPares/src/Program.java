import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int somaPar = 0;

        int[] vetor = new int[n];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] % 2 == 0){
                somaPar += 1;
            }
        }

        System.out.println("Numeros pares:");
        for(int numero : vetor){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Total de numeros pares = " + somaPar);

        sc.close();
    }
}
