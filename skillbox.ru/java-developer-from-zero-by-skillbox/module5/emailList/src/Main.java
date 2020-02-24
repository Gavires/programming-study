import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main( String[] args )
    {

//        Написать программу, в которой будет храниться перечень e-mail-ов.
//        E-mail’ы  можно добавлять через консоль командой ADD и печатать весь список командой LIST.
//      * Проверять корректность вводимых e-mail’ов и в случае необходимости печатать сообщение об ошибке.

        // Регулярное выражение
        // https://regex101.com/r/2K9bad/1

        ArrayList<String> emailList = new ArrayList<>();
        Pattern email = Pattern.compile( "ADD ([a-zA-Zа-яА-Я0-9\\\\-]+@\\w+.(ru|net|com))" );
        Scanner scanner = new Scanner( System.in );
        String commandConsole;

        // Основной цикл
        while ( true )
        {
            System.out.println( "Введите команду:" );
            commandConsole = scanner.nextLine().trim();

            // Обработка команд
            // ---------------------------------------------------------------------------------------------------------
            if ( commandConsole.trim().equals( "LIST" ) )
            {
                if ( emailList.size() > 0 ) {
                    System.out.println( "Список адресов:" );
                    for ( int i = 0; i < emailList.size(); i++ ) {
                        System.out.println( i + " - " + emailList.get(i) );
                    }
                }
                else {
                    System.out.println( "Список пуст" );
                }
                continue;
            }
            // ---------------------------------------------------------------------------------------------------------
            Matcher m = email.matcher( commandConsole );
            if ( m.find() )
            {
                emailList.add ( m.group(1) );
            }
            else {
                System.out.println( "Неизвестная команда" );
            }
        }
    }
}