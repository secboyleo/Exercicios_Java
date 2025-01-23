import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("POSTO DE GASOLINA%nDigite o código:%n");
        System.out.printf("[1] Alcool%n[2] Gasolina%n[3] Diesel%n[4] Sair%n>>>");

        int codigo = sc.nextInt();
        int alccol = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4){
            switch (codigo){
                case 1 -> alccol += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                default -> System.out.println("Insira um código válido");
            }
            System.out.print(">>>");
            codigo = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO%nTOTAL DE CLIENTES%n");
        System.out.printf("[%d] Alcool%n[%d] Gasolina%n[%d] Diesel", alccol, gasolina, diesel);
        sc.close();
    }
}