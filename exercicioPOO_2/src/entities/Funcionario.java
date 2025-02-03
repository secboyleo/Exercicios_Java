package entities;

public class Funcionario {
    public String nome;
    public double grossSalary; //salario bruto
    public double tax; //taxa

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double taxa){
        grossSalary += grossSalary * taxa / 100.0;
    }

    public String toString(){
        return nome + "," + " $ " + String.format("%.2f", netSalary());
    }
}
