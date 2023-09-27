import java.util.Locale;
import java.util.Scanner;

public class bee1008{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, workedHour;
        double hourValue, salario;

        num = sc.nextInt();
        workedHour = sc.nextInt();
        hourValue = sc.nextDouble();

        salario = workedHour * hourValue;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}