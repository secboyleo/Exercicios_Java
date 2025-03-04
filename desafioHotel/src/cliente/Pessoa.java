package cliente;

public class Pessoa {
    public String nome;
    public String email;
    public int quarto;

    public Pessoa(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
