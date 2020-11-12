package magic_square;

public class MagicSquareTest
{
    private static final int ARRAY_DIMENSION = 3;

    public static void main( String[] args ) {
        int[][] randomArray = generateRandom2DArray( ARRAY_DIMENSION );
        System.out.println( "randomArray is magic? " + MagicSquare.isMagic( randomArray ));

        int[][] magicArray = {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };
        System.out.println( "magicArray is magic? " + MagicSquare.isMagic( magicArray ));
    }

    private static int[][] generateRandom2DArray( int dimension ) {
        int[][] array = new int[ dimension ][ dimension ];
        for ( int i = 0; i < dimension; i++ )
        {
            for ( int j = 0; j < dimension; j++ )
            {
                array[i][j] = getRandomIntegerInRange( 1, 9 );
            }
        }
        return array;
    }

    private static int getRandomIntegerInRange( int from, int to ){
        return (int) ( from + Math.random() * to );
    }
}
