package application;

import bankOp.Operations;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        // eu sei que da para melhorar isso aqui
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Operations novaConta  = new Operations();

        int flag = 0;
        System.out.println("Bank System");
        while (flag != 2){
            System.out.println("");
            System.out.println("[1] New account");
            System.out.println("[2] Exit");
            System.out.print(">>>");
            flag = sc.nextInt();

            if (flag == 1){
                System.out.print("Enter Account number: ");
                int numeroConta = sc.nextInt();
                novaConta.setNumeroConta(numeroConta);

                System.out.print("Enter Account Holder: ");
                novaConta.name = sc.next();

                System.out.print("Is there an initial deposit (y/n): ");
                String yesNo = sc.next();

                double dinheiro = 0;
                if (yesNo.equals("y")){
                    System.out.print("Enter a deposit value: ");
                    dinheiro = sc.nextDouble();
                    novaConta.deposito(dinheiro);
                }

                System.out.println("Account data:");
                System.out.println(novaConta.dadosShow());

                System.out.print("Enter a deposit value: ");
                dinheiro = sc.nextDouble();
                novaConta.deposito(dinheiro);

                System.out.println("Updated Account data:");
                System.out.println(novaConta.dadosShow());

                System.out.print("Enter a withdraw value: ");
                dinheiro = sc.nextDouble();
                novaConta.saque(dinheiro);

                System.out.println("Updated Account data:");
                System.out.println(novaConta.dadosShow());
            }
            }





        sc.close();
    }
}
