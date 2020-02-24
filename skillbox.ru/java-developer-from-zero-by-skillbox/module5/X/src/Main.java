import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {
//        String[][] x = {
//                { "X", " ", " ", " ", " ", " ", "X" },
//                { " ", "X", " ", " ", " ", "X", " " },
//                { " ", " ", "X", " ", "X", " ", " " },
//                { " ", " ", " ", "X", " ", " ", " " },
//                { " ", " ", "X", " ", "X", " ", " " },
//                { " ", "X", " ", " ", " ", "X", " " },
//                { "X", " ", " ", " ", " ", " ", "X" },
//        };
//
//        for ( int i = 0; i < x.length; i++ )
//        {
//            for ( int j = 0; j < x[i].length; j++ )
//            {
//                System.out.print( x[i][j] );
//            }
//            // Перенос строки
//            System.out.println();
//        }

        // Посложнее вариант
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Введите размер крестика от 3: " );
        int size = 0;

        while ( size < 3 )
        {
            size = scanner.nextInt();
            if ( size < 3 ) {
                System.out.println( "Введенное число меньше 3!" );
            }
            else {
                break;
            }
        }

        // Создаем массив
        String[][] x = new String[ size ][ size];
        for ( int indexStart = 0; indexStart < size; indexStart++ )
        {
            // Заполняем крестами
            for ( int indexX = 0; indexX < size; indexX++ )
            {
                if ( (indexX == indexStart) || (indexX == x.length - 1 - indexStart) ) {
                    x[ indexStart ][indexX] = "X";
                }
                else {
                    x[ indexStart ][indexX] = " ";
                }
            }
        }

        // "Печатаем" крестик в консоли
        for ( int i = 0; i < x.length; i++ )
        {
            for ( int j = 0; j < x[i].length; j++ )
            {
                System.out.print( x[i][j] );
            }
            // Перенос строки
            System.out.println();
        }
    }
}
