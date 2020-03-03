import java.util.Scanner;

public class Main {

    public static void showMatrix( int number ) {
        String numberFromInt = String.valueOf( number );
        int numberLength = numberFromInt.length();

        if ( numberLength == 1 ) {
            System.out.print( " |    " + numberFromInt );
        }
        else if ( numberLength == 2 ) {
            System.out.print( " |   "  + numberFromInt );
        }
        else if ( numberLength == 3 ) {
            System.out.print( " |  " + numberFromInt );
        }
        else if ( numberLength > 3 ) {
            System.out.print( " | " + numberFromInt );
        }
    }

    public static void main(String[] args) {
//        Ввести с консоли n - размерность матрицы a [n] [n].
//        Задать значения элементов матрицы в интервале значений от -M до M
//        с помощью генератора случайных чисел (класс Random).

        Scanner scanner = new Scanner( System.in );

        // Ввести с консоли n - размерность матрицы a [n] [n].
        int matrixDimension = 0;
        while ( matrixDimension == 0 ) {
            System.out.println("Введите n-размерность матрицы a[n][n]: ");
            try {
                int numberFromString = Integer.parseInt( scanner.nextLine() );
                if ( numberFromString > 0 ) {
                    matrixDimension = numberFromString;
                } else {
                    System.out.println( "Число не может быть отрицательным или равным нулю!");
                }
            } catch ( NumberFormatException ex ){
                System.out.println("Ошибка! Неверно введено число!");
            }
        }

        // Задать значения элементов матрицы в интервале значений от -M до M
        System.out.println( "Сгенерировать значения элементов матрицы в интервале от -M до M" );
        int[][] matrix = new int[ matrixDimension ][ matrixDimension ];
        for ( int line = 0; line < matrixDimension; line++ ) {
            for ( int column = 0; column < matrixDimension; column++ ) {
                int minRange = -100;
                int maxRange =  100;
                var randomNumber = minRange + (int) ( Math.random() * maxRange * 2 );
                matrix[ line ][ column ] = randomNumber;

                // Красивое отображение матрциы
                showMatrix( randomNumber );
                if ( column == matrixDimension - 1) {
                    System.out.print( " | " );
                }
            }
            System.out.println();
        }

        //==============================================================================================================

        System.out.println( "\n3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки" );
        for ( int line = 0; line < matrixDimension; line++ ) {
            int indexOfFirstPositiveNumber = -1;
            int indexOfSecondPositiveNumber = -1;
            for ( int column = 0; column < matrixDimension; column++ ) {
                if ( matrix[ line ][ column ] > 0 ) {
                    if ( indexOfFirstPositiveNumber < 0 ) {
                        indexOfFirstPositiveNumber = column;
                        continue;
                    }
                    else if ( indexOfSecondPositiveNumber < 0 ) {
                        indexOfSecondPositiveNumber = column;

                        // Подсчет суммы между положительными элементами
                        int sum = 0;
                        for ( int i = indexOfFirstPositiveNumber; i <= indexOfSecondPositiveNumber; i++ ) {
                            sum += matrix[ line ][ i ];
                        }
                        System.out.format("Строка: %d; 1-ый полож. элемент: %d; 2-ой полож. элемент: %d; сумма элементов: %d\n",
                                line + 1,
                                matrix[ line ][ indexOfFirstPositiveNumber ],
                                matrix[ line ][ indexOfSecondPositiveNumber ],
                                sum
                        );
                        break;
                    }
                }
            }
        }

        //==============================================================================================================

        System.out.println( "\n4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие" );

        int maxElement = 0;
        int lineOfMaxElement = 0;
        int columnOfMaxElement = 0;

        for ( int line = 0; line < matrixDimension; line++ ) {
            for (int column = 0; column < matrixDimension; column++) {
                if ( matrix[ line ][ column ] > maxElement ) {
                    maxElement = matrix[ line ][ column ];
                    lineOfMaxElement = line;
                    columnOfMaxElement = column;
                }
            }
        }
        System.out.format( "Максимальный элемент: %d;\nстрока:  %d\nстолбец: %d\n" , maxElement, lineOfMaxElement + 1, columnOfMaxElement + 1 );

        // Удаление строки и столбца, содержащие максимальный элемент
        for ( int line = 0; line < matrixDimension; line++ ) {
            if ( line == lineOfMaxElement ) {
                continue;
            }
            for (int column = 0; column < matrixDimension; column++) {
                if ( column == columnOfMaxElement ) {
                    continue;
                }
                // Красивое отображение матрциы
                showMatrix( matrix[ line ][ column ] );
                if ( column == matrixDimension - 1) {
                    System.out.print( " | " );
                }
            }
            System.out.println();
        }
    }
}