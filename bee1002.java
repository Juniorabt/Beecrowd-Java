import java.util.Locale;
import java.util.Scanner;

public class bee1002{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, radius, pi = 3.14159;

        radius = sc.nextDouble();

        area = Math.pow(radius, 2) * pi;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}