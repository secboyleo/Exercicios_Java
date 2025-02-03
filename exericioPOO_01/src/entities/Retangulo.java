package entities;

public class Retangulo {
    public double a;
    public double b;
    public double area;
    public double perimetro;
    public double diagonal;

    public double areaCalc(double ladoA, double ladoB){
        return ladoA * ladoB;
    }

    public double perimetroCalc(double ladoA, double ladoB){
        return (ladoA * 2) + (ladoB * 2);
    }

    public double diagonalCalc(double ladoA, double ladoB){
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }

    public String toString(){
        return "Area = "
                + area
                + " | Perimetro = "
                + perimetro
                + String.format(" | Diagonal = %.2f%n", diagonal);

    }
}
