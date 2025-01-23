import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Digite um número de 1 a 7:");
        int x = sc.nextInt();

        switch (x) {
            case 1 -> dia = "Domingo";
            case 2 -> dia = "Segunda";
            case 3 -> dia = "Terça";
            case 4 -> dia = "Quarta";
            case 5 -> dia = "Quinta";
            case 6 -> dia = "Sexta";
            case 7 -> dia = "Sábado";
            default -> dia = "Valor Inválido";
        }

        String folga = (x == 1 || x == 7) ? "Folga" : "Sem folga";

        System.out.printf("Dia da semana = %s%nSituacao = %s", dia, folga);
    }
}