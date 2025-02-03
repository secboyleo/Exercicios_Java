package entities;

public class Notas {
    public String nome;
    public double trimestre1;
    public double trimestre2;
    public double trimestre3;

    public double nota(double a, double b, double c){
        return a + b + c;
    }

    public String test(){
        if (nota(trimestre1, trimestre2, trimestre3) < 60.0){
            return "FAILED";
        } else {
            return "PASS";
        }
    }

    public double rec(){
        return 100 - nota(trimestre1, trimestre2, trimestre3);
    }

    public void status(){
        if (test().equals("PASS")){
            System.out.printf("FINAL GRADE = %.2f%n", nota(trimestre1, trimestre2, trimestre3));
            System.out.println(test());
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", nota(trimestre1, trimestre2, trimestre3));
            System.out.println(test());
            System.out.printf("MISSING %.2f POINTS", rec());
        }
    }
}
