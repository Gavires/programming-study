import com.skillbox.airport.*;

public class Loader {

    public static void main ( String[] args ) {
        Airport airport = Airport.getInstance();
        System.out.println( airport.getAllAircrafts() );
        System.out.println( airport.getTerminals() );
    }
}
