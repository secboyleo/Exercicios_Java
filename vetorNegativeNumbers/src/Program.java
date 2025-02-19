import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 10: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i = 0; i<vetor.length; i++){
            System.out.print("Digite o valor da posicao " + i +": ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Valores negativos encontrados:");
        for (int j : vetor) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}
