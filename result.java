import java.util.Scanner;

public class result {
    int result(int result) {
        return result;
    }

    void spr(int result) {
        if ((result >= 90) && (result <= 100)) {
            System.out.println("Your rating is 5");
        } else if ((result >= 80) && (result <= 89)) {
            System.out.println("Your rating is 4");
        } else if ((result >= 70) && (result <= 79)) {
            System.out.println("Your rating is 3");
        } else if ((result >= 60) && (result <= 69)) {
            System.out.println("Your rating is 2");
        } else {
            System.out.println("Your rating is 1");
        }
    }

    public static void result() {
        result m1=new result();
        boolean value = true;
        while (value) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Run program");
            System.out.println("2. Exit");
            System.out.println("Podaj swój wybór");
            int choice = scanner.nextInt();
            m1.result(choice);
            if (choice == 1) {
                System.out.println("What's your result");
                int result = scanner.nextInt();
                m1.spr(result);
            } else if (choice == 2) {
                value = false;
                System.out.println("Koniec programu prostego");
            } else {
                System.out.println("Nie podałeś prawidłowej opcji");
            }

        }
    }
}
