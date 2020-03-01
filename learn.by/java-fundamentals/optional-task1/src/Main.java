import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Введите числа через пробел");
        List <String> numbers = Arrays.asList( scanner.nextLine().split("\\s+" ));

        //==============================================================================================================

        System.out.println( "\n1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");

        long maxLengthOfNumber = 0;
        String maxNumber = "";
        for ( String number : numbers ) {
            long currentLengthOfNumber = number.length();
            if ( currentLengthOfNumber > maxLengthOfNumber ) {
                maxLengthOfNumber = currentLengthOfNumber;
                maxNumber = number;
            }
        }

        long minLengthOfNumber = 9999;
        String minNumber = "";
        for ( String number : numbers ) {
            long currentLengthOfNumber = number.length();
            if ( currentLengthOfNumber < minLengthOfNumber ) {
                minLengthOfNumber = currentLengthOfNumber;
                minNumber = number;
            }
        }

        System.out.format( "Саммое длиное число %s, длина: %d;\nСамое короткое число %s, длина: %d\n", maxNumber, maxLengthOfNumber, minNumber, minLengthOfNumber );

        //==============================================================================================================

        System.out.println( "\n2. Вывести числа в порядке возрастания (убывания) значений их длины.");
        System.out.print( "Вывод чисел в порядке возрастания их длины: ");
        numbers.sort( (number1, number2) -> number1.length() - number2.length() );
        for ( String number : numbers ) {
            System.out.print( number + " ");
        }

        System.out.print( "\nВывод чисел в порядке   убывания  их длины: ");
        numbers.sort( (number2, number1) -> number1.length() - number2.length() );
        for ( String number : numbers ) {
            System.out.print( number + " ");
        }

        //==============================================================================================================

        System.out.println( "\n\n3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");

        double sumOfLengthsOfAllNumbers = 0;
        for ( String number : numbers ) {
            sumOfLengthsOfAllNumbers += number.length();
        }
        double averageLengthOfNumber = sumOfLengthsOfAllNumbers / numbers.size();
        System.out.println( "Средняя длина чисел: " + averageLengthOfNumber);

        System.out.println( "Числа, длина которых меньше средней длины: " );
        numbers.stream()
                .filter( number -> number.length() < averageLengthOfNumber )
                .forEach( number -> System.out.format( "Число: %s, длина: %d\n", number, number.length() ) );

        System.out.println( "Числа, длина которых больше средней длины: " );
        numbers.stream()
                .filter( number -> number.length() > averageLengthOfNumber )
                .forEach( number -> System.out.format( "Число: %s, длина: %d\n", number, number.length() ) );

        //==============================================================================================================
    }
}
