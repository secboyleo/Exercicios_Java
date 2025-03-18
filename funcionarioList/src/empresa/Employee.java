package empresa;

public class Employee{
    private Integer id;
    public String nome;
    private Double salario;

    public Integer getId(){
        return id;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public Employee(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentaSalario(double porcentagem){
        double z = salario * porcentagem;
        double result = z / 100;
        salario += result;
    }

    public void show(){
        System.out.print(id + " | " + nome + " | R$" + salario);
    }

}