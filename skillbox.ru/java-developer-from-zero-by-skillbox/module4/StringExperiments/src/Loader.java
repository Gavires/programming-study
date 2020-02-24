import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Loader
{
    public static void main(String[] args) throws IOException {

//        Распечатать коды всех латинских букв и сами буквы.
        String chars = "abcdefzhiklmnopqrstvxABCDEFZHIKLMNOPQRSTVX";
        for ( int i = 0; i < chars.length(); i++ ) {
            System.out.println( "code: " + (int) chars.charAt(i) + "; char: " + chars.charAt(i) );
        }


//        написать код, который считает сумму заработка Васи и Маши.
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println( text );

        int vasyaRub = Integer.parseInt( text.substring( 15, text.indexOf( "рублей" ) ).trim() );
        int mashaRub = Integer.parseInt( text.substring( text.lastIndexOf( "Маша - " ) + 6, text.lastIndexOf( "рублей" ) ).trim() );

        System.out.println( "Заработок Васи и Маши: " + ( vasyaRub + mashaRub ) );

        //Задание на регулярные выражения
        //String textReg = text.replaceAll( "[а-яА-Я]","" );
        //String textArray[] = textReg.split( ",\\s*\\-*" );

        Pattern pattern = Pattern.compile( "(Вася|Петя|Маша)|(\\d+)" );
        Matcher m = pattern.matcher( text );

        int[] pay = new int[3]; // Массив заработков

        int iterator = 0;
        while (m.find() )
        {
            // Имя работника
            if ( m.group(1) != null )
            {
                System.out.print( m.group(1) + " заработал(а): ");
            }
            // Заработок
            if ( m.group(2) != null && iterator <= 3 )
            {
                System.out.println( m.group(2) + " руб.");
                pay[ iterator ] = Integer.parseInt( m.group(2) );
                iterator++;
            }
        }

        // Подсчет заработков
        System.out.println( "Вася и Петя: " + ( pay[0] + pay[1] ) );
        System.out.println( "Вася и Маша: " + ( pay[0] + pay[2] ) );
        System.out.println( "Петя и Маша: " + ( pay[1] + pay[2] ) );
        System.out.println( "Все трое: " + ( pay[0] + pay[1] + pay[2] ) );


//        Написать программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой
//        (например, “Иванов Сергей Петрович”) и выводит фамилию, имя и отчество отдельно
//        в следующем формате:
//        Фамилия: Иванов
//        Имя: Сергей
//        Отчество: Петрович

        System.out.println("Введите Ваше ФИО:");
        String[] fio = ( new BufferedReader( new InputStreamReader( System.in )) ).readLine().trim().split( "\\s+");
        // Debug
//        for ( int i = 0; i < fio.length; i++ ) {
//            System.out.println( fio[i] );
//        }

        //"Дробление" строки на фрагменты
        if ( fio.length > 0 ) {
            System.out.println( "Фамилия: " + fio[0] );
        }

        if ( fio.length > 1 ) {
            System.out.println(  "Имя: " + fio[1] );
        }

        if ( fio.length > 2 ) {
            System.out.println(  "Отчество: " + fio[2] );
        }
    }
}