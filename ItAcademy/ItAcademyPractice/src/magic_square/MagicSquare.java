package magic_square;

public class MagicSquare
{
    public static boolean isMagic( int[][] array ) {
        try {
            int[] rowSums = getRowSums( array );
            int[] columnSums = getColumnSums( array );
            int mainDiagonalSum = getMainDiagonalSum( array );
            int sideDiagonalSum = getSideDiagonalSum( array );

            if ( mainDiagonalSum != sideDiagonalSum ) {
                throwException();
            }
            return true;
        }
        catch ( NotMagicSquareException e ) {
            e.printStackTrace();
            return false;
        }
    }

    private static int[] getRowSums( int[][] array ) throws NotMagicSquareException {
        int[] rowSums = new int[ array.length ];
        for ( int row = 0; row < array.length; row++ )
        {
            int sum = 0;
            for ( int value : array[ row ]) {
                sum += value;
            }
            rowSums[ row ] = sum;

            if ( row > 0 && rowSums[ row ] != rowSums[ row - 1 ]) {
                throwException();
            }
        }
        return rowSums;
    }

    private static int[] getColumnSums( int[][] array ) throws NotMagicSquareException {
        int[] columnSums = new int[ array.length ];
        for ( int i = 0; i < array.length; i++ )
        {
            int sum = 0;
            for ( int column = 0; column < array.length; column++ ) {
                sum += array[ column ][ i ];
            }
            columnSums[ i ] = sum;

            if ( i > 0 && columnSums[ i ] != columnSums[ i - 1 ]) {
               throwException();
            }
        }
        return columnSums;
    }

    private static int getMainDiagonalSum( int[][] array ) {
        int sum = 0;
        int i = 0;
        for ( int j = 0; j < array.length; j++ ) {
            sum += array[ i++ ][ j ];
        }
        return sum;
    }

    private static int getSideDiagonalSum( int[][] array ) {
        int sum = 0;
        int i = 0;
        for ( int j = array.length - 1; j >= 0; j--  ) {
            sum += array[ i++ ][ j ];
        }
        return sum;
    }

    private static void throwException() throws NotMagicSquareException {
        throw new NotMagicSquareException( "This square is not magic!" );
    }
}


