package hash;

public class Cripto {
    String senha = "@tdv889++))";
    String nome = "darthvader";
    int pswSal = senha.hashCode();
    int loginSal = nome.hashCode();
    int hashOrignal = pswSal + loginSal;

    public int verify(String password, String login){
        int testeSenha = password.hashCode();
        int testeLogin = login.hashCode();
        int hashTeste= testeSenha + testeLogin;

        if (hashTeste == hashOrignal){
            return 1;
        } else {
            return 0;
        }
    }
}
