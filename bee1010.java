import java.util.Locale;
import java.util.Scanner;

public class bee1010 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, num1, code2, num2;
        double valor1, valor2;

        code1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        code2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double total = ((int)num1 * valor1) + ((int)num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }
}