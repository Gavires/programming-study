package magic_square;

public class MagicSquare
{
    public static boolean isMagic( int[][] array ) {
        try {
            checkSumOfDiagonals( array );
            checkSumOfRowsAndColumns( array );
            return true;
        }
        catch ( NotMagicSquareException e ) {
            e.printStackTrace();
            return false;
        }
    }

    private static void checkSumOfRowsAndColumns( int[][] array ) throws NotMagicSquareException {
        int[] rowSums = new int[ array.length ];
        int[] columnSums = new int[ array.length ];

        for ( int row = 0; row < array.length; row++ )
        {
            for ( int column = 0; column < array.length; column++ )
            {
                // Accumulate sum of columns
                columnSums[ column] += array[ row ][ column ];

                // Accumulate sum of rows
                rowSums[ row ] += array[ row ][ column ];
            }
        }
        // Check all sums of rows and columns
        for ( int i = 0; i < array.length; i++ )
        {
            if ( rowSums[ i ] != columnSums[ i ])
            {
                throwException();
            }
        }
    }

    private static void checkSumOfDiagonals( int[][] array ) throws NotMagicSquareException {
        int mainDiagonalSum = 0;
        int sideDiagonalSum = 0;

        // Accumulate sum of main and side diagonals
        int sideId = array.length - 1;
        for ( int mainId = 0; mainId < array.length; mainId++ )
        {
            mainDiagonalSum += array[ mainId ][ mainId ];
            sideDiagonalSum += array[ sideId ][ sideId ];
            sideId--;
        }

        // Check these sums
        if ( mainDiagonalSum != sideDiagonalSum ) {
            throwException();
        }
    }

    private static void throwException() throws NotMagicSquareException {
        throw new NotMagicSquareException( "This square is not magic!" );
    }
}


