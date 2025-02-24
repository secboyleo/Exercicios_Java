package application;

import java.util.Scanner;
import pessoas.Pessoa;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        Pessoa[] vetorP = new Pessoa[n];

        for(int i=0; i<vetorP.length; i++){
            System.out.println("Digite os dados da " + (i + 1) + " pessoa:");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vetorP[i] = new Pessoa(nome, idade);
        }

        String nomeMaisVelho = "";
        int maisVelho = 0;
        for(Pessoa pessoa : vetorP){
            if(pessoa.idade > maisVelho){
                maisVelho = pessoa.idade;
                nomeMaisVelho = pessoa.nome;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);

        sc.close();
    }
}
