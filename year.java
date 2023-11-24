import java.util.Scanner;

public class rok_przystępny {
    String year(int year)
    {
        if((((year%4)==0)&&(year%100)!=0)&&(year%400)==0)
        {
            return "Year which you write is accessible";
        }
        else
        {
            return "Year which you write is not accessible";
        }

    }
    public static void year()
    {
        rok_przystępny next_year=new rok_przystępny();
        Scanner m1=new Scanner(System.in);
        System.out.println("Write some year");
        int year = m1.nextInt();
        next_year.year(year);
    }
}
