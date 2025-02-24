package pessoas;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public double nota1;
    public double nota2;

    public Pessoa(String nome,String sobrenome, double nota1, double nota2){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calculaMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

}
