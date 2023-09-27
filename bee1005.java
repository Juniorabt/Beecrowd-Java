import java.util.Locale;
import java.util.Scanner;

public class bee1005{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, avg;

        A = sc.nextDouble();
        B = sc.nextDouble();
        
        avg = (A * 3.5 + B* 7.5) / 11;

        System.out.printf("AVERAGE = %.5f%n", avg);

        sc.close();
    }
}