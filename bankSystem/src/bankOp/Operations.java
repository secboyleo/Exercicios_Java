package bankOp;

public class Operations {
    public String name;
    private int numeroConta;
    private double saldo;

    public Operations(){
    }

    public Operations(String name, int numeroConta, double saldo){
        this.name = name;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Operations(String name, int numeroConta){
        this.name = name;
        this.numeroConta = numeroConta;
        saldo = 0;
    }

    public void setNumeroConta(int numero){
        this.numeroConta = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void deposito(double dinheiro){
        this.saldo += dinheiro;
    }

    public void saque(double dinheiro){
        this.saldo -= dinheiro + 5;
    }

    public String dadosShow(){
        return "Account: "
                + String.format("%d", numeroConta)
                + " | Holder: "
                + name
                + " | Balance: "
                + String.format("$ %.2f", saldo);
    }



}
