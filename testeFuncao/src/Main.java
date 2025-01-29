import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login");
        String nome = sc.next();
        System.out.println("Digite sua senha");
        int senha = sc.nextInt();

        String result = sejaBemvindo(nome, senha);

        System.out.println(result);
    }

    public static String sejaBemvindo(String x, int y){
        if (x.equals("Leonardo") && y == 1234){
            return "Seja bem vindo " + x;
        } else {
            return "Login ou senha incorretos";
        }
    }
}
