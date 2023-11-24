import java.sql.SQLOutput;
import java.util.Scanner;

public class largets_numbers {
    void largest_number() {
        while (true) {
            int[] tablle = new int[3];
            int[] new_table=new int[3];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 3 numbers:");
            for (int i = 0; i < tablle.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                tablle[i] = scanner.nextInt();
            }
            int maxlength1 = tablle[0];
            for (int i = 1; i < tablle.length; i++) {
                if (tablle[i] > maxlength1) {
                    maxlength1 = tablle[i];
                }
            }
            System.out.println(maxlength1);


        }
    }
}
