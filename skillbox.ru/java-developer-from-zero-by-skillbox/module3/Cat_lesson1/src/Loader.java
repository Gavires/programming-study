
public class Loader {
    public static void main( String[] args ) {

//        Урок 1. Понятие класса и объекта
//        Создать 5-7 кошек и повызывать у них различные методы:
//        посмотреть, какой у них вес
//        попробовать их покормить и посмотреть, что будет с весом
//        попробовать перекормить кошку, чтобы она взорвалась
//        "замяукать" кошку до смерти

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        // посмотреть, какой у них вес
        System.out.println( "Вес кошек до кормления:" );
        System.out.println( cat1.getWeight() );
        System.out.println( cat2.getWeight() );
        System.out.println( cat3.getWeight() );
        System.out.println( cat4.getWeight() );
        System.out.println( cat5.getWeight() );

        // попробовать их покормить и посмотреть, что будет с весом
        cat1.feed(100.0);
        cat2.feed(10.0);
        cat3.feed(50.0);
        cat4.feed(60.0);
        cat5.feed(150.0);

        System.out.println( "Вес кошек после кормления:" );
        System.out.println( cat1.getWeight() );
        System.out.println( cat2.getWeight() );
        System.out.println( cat3.getWeight() );
        System.out.println( cat4.getWeight() );
        System.out.println( cat5.getWeight() );

        //попробовать перекормить кошку, чтобы она взорвалась
        cat1.feed(10000.0);
        System.out.println( "Взрыв кошки после перекормления" );
        System.out.println( cat1.getStatus() );

        //"замяукать" кошку до смерти
        for ( int i = 0; i < 5000; i++ ) {
            cat2.meow();
        }
        System.out.println( cat2.getStatus() );
    }
}