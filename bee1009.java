import java.util.Locale;
import java.util.Scanner;

public class bee1009{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo, vendasTotal, total;

        nome = sc.next();
        salarioFixo = sc.nextDouble();
        vendasTotal = sc.nextDouble();

        total = salarioFixo + vendasTotal * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);
        
        sc.close();
    }
}