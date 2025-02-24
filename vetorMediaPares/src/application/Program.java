package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        int somaPar = 0;
        int quantidadePar = 0;
        int[] vet = new int[n];

        for(int i=0; i< vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0){
                somaPar += vet[i];
                quantidadePar += 1;
            }
        }

        int media = somaPar / quantidadePar;

        System.out.println("MEDIA DOS PARES = " + media);

        sc.close();

    }
}
