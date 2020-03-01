import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Введите число от 1 до 12");
        int number = Integer.parseInt( scanner.nextLine() );
        LocalDate localDate = LocalDate.of( 2020, number, 1 );
        System.out.println( localDate.getMonth() );
    }
}
