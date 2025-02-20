import fulano.Pessoa;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for(int i=0; i<vetor.length; i++){
            System.out.printf("Dados da %d pessoa:%n", i+1);
            System.out.print("NOME = ");
            String nome = sc.next();
            System.out.print("IDADE = ");
            int idade = sc.nextInt();
            System.out.print("ALTURA = ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
        }

        double somaMedia = 0.0;
        int somaIdade = 0;

        for(Pessoa pessoa : vetor){
            somaMedia += pessoa.altura;

            if(pessoa.idade < 16){
                somaIdade += 1;
            }
        }

        double porcentIdade =(double) (somaIdade * 100) / vetor.length;

        double avr = somaMedia / vetor.length;
        System.out.println(" ");
        System.out.printf("MEDIA DA ALTURA = %.2f%n", avr);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcentIdade);

        for(Pessoa pessoa : vetor){
            if(pessoa.idade < 16){
                System.out.println(pessoa.show());
            }
        }

        sc.close();
    }
}
