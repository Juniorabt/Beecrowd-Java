import java.util.Scanner;

public class bee1004{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b, prod;

        a = sc.nextInt();
        b = sc.nextInt();
        
        prod = a * b;

        System.out.println("PROD = " + prod);

        sc.close();
    }
}