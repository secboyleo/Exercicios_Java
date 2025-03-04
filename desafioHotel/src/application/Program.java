package application;
import cliente.Pessoa;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be ranted: ");
        int n = sc.nextInt();
        System.out.println(" ");

        Pessoa[] vetorClientes = new Pessoa[n];
        Pessoa[] vetorQuartos = new Pessoa[10];

        for(int i=0; i<vetorClientes.length; i++){
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name:");
            String nome = sc.next();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Room number:");
            int quarto = sc.nextInt();
            System.out.println(" ");

            vetorClientes[i] = new Pessoa(nome, email, quarto);
            vetorQuartos[(vetorClientes[i].quarto - 1)] = new Pessoa(nome, email);
        }


        System.out.println(" ");
        System.out.println("Busy rooms:");
        for(int i=0; i<vetorQuartos.length; i++){
            if(vetorQuartos[i] != null){
                System.out.println((i + 1) + ": " + vetorQuartos[i].nome + ", " + vetorQuartos[i].email);
            }
        }


        sc.close();
    }
}
