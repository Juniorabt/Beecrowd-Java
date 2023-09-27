import java.util.Locale;
import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        int code = sc.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        double total;
        if (code == 1){
            total = quantity * 4.0;
        } else if (code == 2) {
            total = quantity * 4.5;
        } else if (code == 3) {
            total = quantity * 5.0;
        } else if (code == 4) { 
            total = quantity * 2.0;
        } else {
            total = quantity * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();

    }
}