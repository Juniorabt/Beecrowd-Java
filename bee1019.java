import java.util.Scanner;

public class bee1019{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N, resto, h, min, seg;

        N = sc.nextInt();

        h = N / 3600;
        resto = N % 3600;

        min = resto / 60;

        seg = resto % 60;

        System.out.println(h + ":" + min + ":" + seg);

        sc.close();

    }
}