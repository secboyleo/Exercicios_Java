import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xSalada, cachorroQuente, xBacon, torrada, refrigerante, result;
        int codigo, numPedidos;

        cachorroQuente = 4.00; //1
        xSalada = 4.50;        //2
        xBacon = 5.00;         //3
        torrada = 2.00;        //4
        refrigerante = 1.50;   //5

        System.out.printf("Selecione um código%n[1] Cachorro quente%n[2] X-Saladar%n[3] X-Bacon%n[4] Torrada%n[5] Refrigerante%n>>>");
        codigo = sc.nextInt();
        System.out.print("Número de pedidos >>>");
        numPedidos = sc.nextInt();

        if (codigo == 1){
            result = (double) cachorroQuente * numPedidos;
            System.out.printf("VALOR A PAGAR = R$ %.2f", result);
        } else if (codigo == 2) {
            result = (double) xSalada * numPedidos;
            System.out.printf("VALOR A PAGAR = R$ %.2f", result);
        } else if (codigo == 3) {
            result = (double) xBacon * numPedidos;
            System.out.printf("VALOR A PAGAR = R$ %.2f", result);
        } else if (codigo == 4) {
            result = (double) torrada * numPedidos;
            System.out.printf("VALOR A PAGAR = R$ %.2f", result);
        } else if (codigo == 5) {
            result = (double) refrigerante * numPedidos;
            System.out.printf("VALOR A PAGAR = R$ %.2f", result);
        } else {
            System.out.println("O item escolhido não existe");
        }
    }
}