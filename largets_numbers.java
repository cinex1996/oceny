import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean value = true;
        result m1 = new result();
        rok_przystępny year = new rok_przystępny();
        largets_numbers number=new largets_numbers();
        Scanner answer = new Scanner(System.in);
        int choice = 0;
        while (value) {

                System.out.println("Welcome in superprogram");
                System.out.println("1.Run program which is about result finish score");
                System.out.println("2.Run program which is about year accesible");
                System.out.println("3.Run program which check larggest number");
                System.out.println("4.Sort numbers");
                System.out.println("5.Exit program");
                System.out.println("Give your choice");
            try {
                choice=answer.nextInt();
                if (choice == 1) {
                    m1.result();
                } else if (choice == 2) {
                    year.year();
                }
                else if(choice==3) {
                        number.largest_number();
                    }
                 else if (choice == 5) {
                    value = false;
                    System.out.println("The program finish work");
                }
            } catch (InputMismatchException e)
            {

                System.out.println("You can't write letters only numbers!!");
                answer.next();

            }





        }
    }
}
