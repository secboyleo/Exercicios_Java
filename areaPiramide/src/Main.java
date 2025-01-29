import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;
        System.out.println("Enter de measures of triangle X:");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Enter de measures of triangle Y:");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double px = (xa + xb + xc) / 2;
        double py = (ya + yb + yc) / 2;

        double areaX =  Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
        double areaY =  Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));

        System.out.printf("Area of Triangle X: %.4f%n", areaX);
        System.out.printf("Area of Triangle Y: %.4f%n", areaY);
        sc.close();

        if (areaX > areaY){
            System.out.println("Larger Area = X");
        } else {
            System.out.println("Larger Area = Y");
        }
    }
}