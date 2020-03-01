import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Введите целые числа через пробел");
        String[] numbers = scanner.nextLine().split("\\s+" );

        int rezult = 0;
        for ( int i =0; i < numbers.length ; i++ ) {
            rezult += Integer.parseInt( numbers[i] );
        }
        System.out.println( "Сумма чисел: " + rezult );

        rezult = 1;
        for ( int i =0; i < numbers.length ; i++ ) {
            rezult *= Integer.parseInt( numbers[i] );
        }
        System.out.println( "Произведение чисел: " + rezult );
    }
}
