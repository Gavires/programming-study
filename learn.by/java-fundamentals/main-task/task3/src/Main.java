import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Сколько случайных чисел сгенерировать?");
        int countOfNumbers = Integer.parseInt( scanner.nextLine() );
        int[] numbers = new int[countOfNumbers];

        System.out.println( "Вывод чисел с переносом строки:");
        for ( int i = 0; i < countOfNumbers; i++ ) {
            numbers[i] = (int) ( Math.random() * 100 );
            System.out.println( numbers[i] );
        }

        System.out.println( "Вывод чисел в одну строку:");
        for ( int i = 0; i < countOfNumbers; i++ ) {
            System.out.print( numbers[i] + " " );
        }
    }
}
