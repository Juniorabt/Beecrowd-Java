import java.util.Locale;
import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();
        
        float avg = ((N1 * 2f) + (N2 * 3f) + (N3 * 4f) + (N4 * 1f)) / 10f;

        System.out.printf("Average: %.1f%n", avg);

        if (avg >= 7.0) {
            System.out.println("Approved student.");
        } else if (avg < 5f) {
            System.out.println("Failed student.");
        } else {
            System.out.println("Student taking exam.");
            
            float examGrade = sc.nextFloat();
            System.out.printf("Average: %.1f%n", examGrade);

            float examAvg = (examGrade + avg) / 2f;

            if (examAvg >= 5f) {
                System.out.println("Approved student.");
            } else {
                System.out.println("Failed student.");
            }

            System.out.printf("Final average: %.1f%n", examAvg);

        }

        sc.close();

    }
}