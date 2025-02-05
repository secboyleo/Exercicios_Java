package application;

import entidade.Conversao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        double valorDolar = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double quantidadeDolar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", Conversao.dolarCalculator(valorDolar, quantidadeDolar));

        sc.close();
    }
}
