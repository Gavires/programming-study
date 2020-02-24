import java.io.IOException;
import java.util.*;

public class Main
{

    public static void main(String[] args ) throws IOException
    {
//        Написать генератор блатных автомобильных номеров и реализовать поиск элементов в списке прямым перебором,
//        бинарным поиском, поиском с помощью HashSet и с помощью TreeSet. Измерить и сравнить длительность 4-х видов
//        поиска и написать результат в качестве решения домашнего задания.
//        A333AA197
//        "A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"

        Scanner scanner = new Scanner( System.in );

        // Переменная, которая содержит сгенерированную часть номера
        StringBuilder carNumberBuilder = new StringBuilder();

        // Создаем списки
        ArrayList<String> carNumbersList = new ArrayList<>();
        TreeSet<String> carNumbersTreeSet = new TreeSet<>();
        HashSet<String> carNumbersHashSet = new HashSet<>();

        // Буквы в номере ( length = 12 )
        String carNumberLatters[] = { "AA", "BB", "EE", "KK", "MM", "HH", "OO", "PP", "CC", "TT", "YY", "XX" };

        // Цифры в номере
        String carNumberDigits[] = { "000", "111", "222", "333", "444", "555", "666", "777", "888", "999" };

        // Время начала генерации
        long timeStart = System.nanoTime();

        // Генерируем номер
        // Первая буква в номере
        for ( int i = 0; i < carNumberLatters.length; i++ )
        {
            carNumberBuilder.append( carNumberLatters[ i ].substring( 0, 1 )); // Первая буква

            // Номер и последние буквы
            for ( int j = 0; j < carNumberDigits.length; j++ )
            {
                carNumberBuilder.append( carNumberDigits [ j ] );
                carNumberBuilder.append( carNumberLatters[ i ] ); // Последние буквы

                // Регион
                for ( int k = 101; k <= 197; k++ )
                {
                    carNumberBuilder.append( Integer.toString( k ) );
                    carNumbersList.add( carNumberBuilder.toString() );

                    System.out.println(carNumberBuilder);
                    // Очищаем последние 3 символа (регион) из строки билдера
                    carNumberBuilder.delete( 6, carNumberBuilder.length() );
                }
                // Очищаем последние две буквы, номер и регион из строки билдера
                carNumberBuilder.delete( 1, carNumberBuilder.length() );
            }

            // Очищаем билдер полностью
            carNumberBuilder.delete( 0, carNumberBuilder.length() );
        }

        // Добавляем номера в списки
        carNumbersHashSet.addAll( carNumbersList );
        carNumbersTreeSet.addAll( carNumbersList );

        System.out.println( "Списки номеров сгенерированы за " + (System.nanoTime() - timeStart) + " нс (" + (System.nanoTime() - timeStart) / 1000000 + " ms)"  );

        // Запрос номера на вывод
        while ( true )
        {
            System.out.println( "Введите запрос в формате А333АА197: " );
            String carNumberRequest = scanner.nextLine();
            boolean resultSearch;

            // Прямой перебор
            timeStart = System.nanoTime();
            resultSearch = carNumbersList.contains( carNumberRequest );
            System.out.println( "Прямой перебор: " + (System.nanoTime() - timeStart) + " нс; Результат: " + resultSearch );

            // Бинарный поиск
            timeStart = System.nanoTime();
            int binaryResultSearch = Collections.binarySearch( carNumbersList, carNumberRequest );
            System.out.print( "Бинарный поиск: " + (System.nanoTime() - timeStart) + " нс; Результат: " );

            if ( binaryResultSearch > 0 ) {
                System.out.println( "true" );
            }
            else{
                System.out.println( "false" );
            }
            System.out.println(binaryResultSearch);

            // TreeSet
            timeStart = System.nanoTime();
            resultSearch= carNumbersTreeSet.contains( carNumberRequest );
            System.out.println( "TreeSet: " + (System.nanoTime() - timeStart) + " нс; Результат: " + resultSearch );

            // HashSet
            timeStart = System.nanoTime();
            resultSearch= carNumbersHashSet.contains( carNumberRequest );
            System.out.println( "HashSet: " + (System.nanoTime() - timeStart) + " нс; Результат: " + resultSearch );
        }
    }
}
