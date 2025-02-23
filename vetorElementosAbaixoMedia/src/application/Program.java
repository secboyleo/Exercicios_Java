package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double soma = 0.0;
        double[] vet = new double[n];

        for(int i=0; i< vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / vet.length;
        System.out.printf("Media do vetor: %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(double num : vet){
            if(num < media){
                System.out.println(num);
            }
        }

        sc.close();
    }
}
