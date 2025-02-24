package application;
import pessoas.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final double MEDIA = 60.0;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        Pessoa[] vetorP = new Pessoa[n];

        for(int i=0; i< vetorP.length; i++){
            System.out.println("Digite os dados da pessoa " + (i + 1) + ": ");
            System.out.print("Nome e sobrenome: ");
            String nome = sc.next();
            String sobrenome = sc.next();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            vetorP[i] = new Pessoa(nome, sobrenome, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");
        for(Pessoa pessoa : vetorP){
            if(pessoa.calculaMedia(pessoa.nota1, pessoa.nota2) >= MEDIA){
                System.out.println(pessoa.nome + " " + pessoa.sobrenome);
            }
        }

        sc.close();
    }
}
