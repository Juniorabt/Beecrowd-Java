import java.util.Locale;
import java.util.Scanner;

public class bee1012{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble(); 
        B = sc.nextDouble();
        C = sc.nextDouble();

        double trianguloRet = A * C / 2.0;
        double circulo = 3.14159 * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2.0;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", trianguloRet);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();

    }
}