import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Idade: ");
        idade = sc.nextInt();
        System.out.println("Altura: ");
        altura = sc.nextDouble();

        System.out.printf("Nome: %s | Idade: %d | Altura: %.2f%n", nome, idade, altura);

        sc.close();;
    }
}