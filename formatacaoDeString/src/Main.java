public class Main {
    public static void main(String[] args) {
        String x = " Dragoes e dragoas ";

        String a = x.toLowerCase();
        String b = x.toUpperCase();
        String c = x.trim(); //corta o espaço das bordas

        String d = x.substring(3, 5);

        String e = x.replace("a", "9");

        String[] vect = x.split(" "); //ele separa de acordo com o que é determinado e guarda em um vetor

        System.out.println("Normal = " + x);
        System.out.println(".toLowerCase = " + a);
        System.out.println(".toUpperCase = " + b);
        System.out.println(".trim = " + c);
        System.out.println("substring = " + d);
        System.out.println("replace = " + e);

        System.out.println("split = " + vect[1]);
        
    }
}