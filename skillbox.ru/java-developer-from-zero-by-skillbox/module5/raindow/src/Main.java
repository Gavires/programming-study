public class Main
{
    public static void main( String[] args )
    {
        String[] rainbow = { "красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};

        // С начала массива
        System.out.println( "Обходим массив с начала ->" );
        for ( int indexColor = 0; indexColor < rainbow.length; indexColor++ )
        {
            System.out.println( rainbow[ indexColor ] );
        }

        // С конца массива
        System.out.println( "Обходим массив с конца <-" );
        for ( int indexColor = rainbow.length - 1; indexColor >= 0; indexColor-- )
        {
            System.out.println( rainbow[ indexColor ] );
        }

        // Переворачиваем массив
        System.out.println( "Переворачиваем массив..." );
        for ( int i = 0; i < rainbow.length / 2; i++ )
        {
            int lastIndex = rainbow.length - 1 - i;  // Индекс элемента с конца массива
            String lastElement = rainbow [ lastIndex ]; // Запоминаем элемент с конца массива
            String firstElement = rainbow [ i ]; // Запоминаем элемент с начала массива

            // Меняем местами элементы
            rainbow[ i ] = lastElement;
            rainbow[ lastIndex ] = firstElement;
        }

        // Вывод результата
        for ( String color : rainbow ) {
            System.out.println( color);
        }
    }
}
