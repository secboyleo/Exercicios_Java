package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre a altura e a largura do retangulo:");
        retangulo.a = sc.nextDouble();
        retangulo.b = sc.nextDouble();
        retangulo.area = retangulo.areaCalc(retangulo.a, retangulo.b);
        retangulo.perimetro = retangulo.perimetroCalc(retangulo.a, retangulo.b);
        retangulo.diagonal = retangulo.diagonalCalc(retangulo.a, retangulo.b);

        System.out.println(retangulo);

        sc.close();
    }
}
