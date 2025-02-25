package application;

import java.util.Locale;
import java.util.Scanner;
import dados.Pessoa;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas peesoas voce vai digitar: ");
        int n = sc.nextInt();
        int numeroDeHomens = 0;
        int numeroDeMulher = 0;
        double mediaAlturaMulher = 0.0;
        double maiorAltura =0.0;
        double menorAltura = 99999;

        Pessoa[] vetor = new Pessoa[n];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            System.out.print("Genero da pessoa " + (i + 1) + ": ");
            String genero = sc.next().toUpperCase();
            vetor[i] = new Pessoa(altura, genero);
        }

        for(Pessoa pessoa : vetor){
            if(pessoa.genero.equals("M")){
                numeroDeHomens += 1;
            } else if (pessoa.genero.equals("F")) {
                mediaAlturaMulher += pessoa.altura;
                numeroDeMulher += 1;
            }

            double maior = pessoa.altura;
            if(maiorAltura < maior){
                maiorAltura = maior;
            } else if (menorAltura > maior) {
                menorAltura = maior;
            }
        }

        System.out.printf("MEDIA ALTURA MULHERES = %.2f%n", (mediaAlturaMulher / numeroDeMulher));
        System.out.println("MAIOR ALTURA = " + maiorAltura);
        System.out.println("MENOR ALTURA = " + menorAltura);
        System.out.println("NUMERO DE HOMEMS = " + numeroDeHomens);
        
        sc.close();
    }
}
