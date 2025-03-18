package application;
import empresa.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos funcionarios voce vai registrar: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Funcionario " + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Esse ID ja esta cadastrado");
                System.out.print(" Escolha outro Id: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Employee pessoa = new Employee(id, nome, salario);
            list.add(pessoa);
        }

        System.out.println();
        System.out.print("Digite um funcionario ID para aumentar o salario: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);

        if(pos != null){
            System.out.print("Quantos %: ");
            double porcentsagem = sc.nextDouble();
            list.get(pos).aumentaSalario(porcentsagem);
        } else {
            System.out.println("Esse funcionario nao existe");
        }

        System.out.println();
        System.out.println("LISTA DE FUNCIONARIOS ATUALIZADA");
        for(Employee pessoa : list){
            pessoa.show();
            System.out.println();
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }

        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
