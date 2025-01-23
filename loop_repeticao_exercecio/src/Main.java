import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite a senha:");
//        int tryy = sc.nextInt();
//
//        while (tryy != 2002){
//            System.out.println("Acesso negado, tente novamente");
//            tryy = sc.nextInt();
//        }
//
//        System.out.println("Acesso permitido");
//        sc.close();
//-----------------------------------------------------------------------------------------
        int x = sc.nextInt();
        int y = sc.nextInt();
        String quadrante = "o";

        while (x != 0){
            if (x > 0){
                quadrante = (y > 0) ? "primeiro quadrante" : "quarto quadrante";
            } else{
                quadrante = (y > 0) ? "segundo quadrante" : "terceiro quadrante";
            }

            System.out.println(quadrante);
            x = sc.nextInt();
            y = sc.nextInt();
        }
        System.out.println("Fim do Programa");
        sc.close();
    }
}