import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main( String[] args )
    {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy - E");

        LocalDate currentDate = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of( 1994, 6,23 );

        int age = currentDate.getYear() - birthdayDate.getYear();
        for ( int i = 0; i < age; i++ ) {
            System.out.println(i + " - " + birthdayDate.format(pattern) );
            birthdayDate = birthdayDate.plusYears(1);
        }
    }
}
