import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for(int i=0; i<vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maior = 0;
        int posicao = 0;
        for(int i=0; i< vet.length; i++){
            if(vet[i]>maior){
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%nPOSICAO = %d", maior, posicao);

        sc.close();
    }
}
