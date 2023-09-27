import java.util.Locale;
import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, avg;

        X = sc.nextInt();
        Y = sc.nextDouble();
        
        avg = (int)X / Y;

        System.out.printf("%.3f km/l %n", avg);

        sc.close();

    }
}