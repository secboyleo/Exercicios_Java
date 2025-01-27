import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = Calculadora(x, y);
        System.out.println("RESULT DA SOMA= " + result);
    }

    public static int Calculadora(int a, int b){
        return (int) a + b;
    }
}