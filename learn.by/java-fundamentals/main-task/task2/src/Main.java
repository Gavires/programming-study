import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Введите аргументы, разделяя их пробелом");
        Scanner scanner = new Scanner ( System.in );

        String[] arguments = scanner.nextLine().split("\\s+");
        System.out.println( "Вывод аргументов в обратном порядке: ");
        for ( int i = arguments.length - 1; i >= 0; i-- ) {
            System.out.print( arguments[i] + " ");
        }
    }
}
