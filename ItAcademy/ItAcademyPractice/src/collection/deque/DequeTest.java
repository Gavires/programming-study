package collection.deque;

import java.util.ArrayDeque;

public class DequeTest
{
    public static void main( String[] args )
    {
        ArrayDeque<String> states = new ArrayDeque<>();

        // стандартное добавление элементов
        states.add( "Германия" );

        // добавляем элемент в самое начало
        states.addFirst( "Франция" );

        // добавляем элемент в самое начало
        states.push( "Великобритания" );

        // добавляем элемент в конец
        states.add( "Италия" );

        // получаем первый элемент без удаления

        System.out.println( states.getFirst() ); // Великобритания

        // получаем последний элемент без удаления
        System.out.println( states.getLast() ); // Италия
        System.out.printf( "Размер очереди: %d \n", states.size() ); // 5

        // перебор коллекции
        while( states.peek() != null ){
            // извлечение c начала
            System.out.println( states.pop() );
        }
    }
}
