package fulano;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String show(){
        return "NOME = " +
                nome +
                " | IDADE = " +
                String.format("%d", idade) +
                " | ALTURA = " +
                String.format("%.2f", altura);
    }

}
