package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Notas;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Notas aluno = new Notas();
        System.out.println("Nome do aluno:");
        aluno.nome = sc.next();

        int flag = 0;
        while (flag == 0){
            System.out.println("NOTA 1:");
            aluno.trimestre1 = sc.nextDouble();
            System.out.println("NOTA 2:");
            aluno.trimestre2 = sc.nextDouble();
            System.out.println("NOTA 3:");
            aluno.trimestre3 = sc.nextDouble();

            if (aluno.trimestre1 <= 30 && aluno.trimestre2 <= 35 && aluno.trimestre3 <= 35){
                aluno.test();
                aluno.status();
                flag = 1;
            } else {
                System.out.println("Notas invalidas");
            }
        }
        sc.close();
    }
}
