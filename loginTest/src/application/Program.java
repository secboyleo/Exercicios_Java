package application;
import hash.Cripto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cripto salgado;
        salgado = new Cripto();

        System.out.println("Login:");
        String login = sc.next();
        System.out.println("Senha:");
        String senha = sc.next();

        int flag = salgado.verify(senha, login);

        if (flag == 1){
            System.out.println("Seja bem-vindo " + login);
        } else {
            System.out.println("Acesso negado");
        }
    }
}
