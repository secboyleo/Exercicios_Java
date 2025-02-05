package entidade;

public class Conversao {
    public static double IOF = 0.06;

    public static double dolarCalculator(double dolarPrice, double dolarQuatity){
        return ((dolarPrice * IOF) + dolarPrice) * dolarQuatity;
    }
}
