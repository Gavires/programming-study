public class Main
{
    public static void main( String[] args )
    {
        // Цикл while
        int i = 200000;
        do {
            System.out.println( "Ticket   № " + i );
            i++;
        }
        while( i <= 210000 );

        i = 220000;
        do {
            System.out.println( "Ticket   № " + i );
            i++;
        }
        while( i <= 235000 );


        // Цикл for
        for ( i = 200000; i <= 210000; i++ ) {
            System.out.println( "Ticket   № " + i );
        }

        for ( i = 220000; i <= 235000; i++ ) {
            System.out.println( "Ticket   № " + i );
        }
    }
}
