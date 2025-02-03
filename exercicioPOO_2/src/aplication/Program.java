package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario employee = new Funcionario();

        System.out.println("Digite os dados do funcionpario:");
        System.out.print("Nome:");
        employee.nome = sc.next();
        System.out.print("Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax:");
        employee.tax = sc.nextDouble();
        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary?");
        double taxa = sc.nextDouble();
        employee.increaseSalary(taxa);

        System.out.println("Update Data: " + employee);

        sc.close();
    }
}
