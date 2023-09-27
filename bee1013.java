import java.util.Scanner;

public class bee1013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        d = (a + b + Math.abs(a - b)) / 2;
        e = (d + c + Math.abs(d - c)) / 2;
        
        System.out.println(e + " eh o maior");

        sc.close();
    }
}