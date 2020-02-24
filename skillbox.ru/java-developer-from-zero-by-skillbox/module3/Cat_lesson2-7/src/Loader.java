
public class Loader {
    public static void main( String[] args ) {

//        Урок 2. Метод, параметры, return
//        Создать в классе Cat метод, который будет возвращать массу съеденной еды
//        Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.

        System.out.println( "------------- УРОК 2 -------------" );

        Cat cat1 = new Cat();

        // Вес кошки
        System.out.println( "Вес кошки: " + cat1.getWeight() );

        // Количество съеденной еды
        cat1.feed(70.0 );
        System.out.println( "Кошка съела " + cat1.getEatenFood() + " гр еды");

        // Сходить в туалет
        System.out.println( "Вес кошки до туалета: " + cat1.getWeight() );
        cat1.goToilet();
        System.out.println( "Вес кошки после туалета: " + cat1.getWeight() );

//        Урок 3. Статические методы и переменные
//
//        Создать у класса Cat статическую переменную count, которая будет увеличиваться, если кошку создали,
//        и убывать, если кошка взорвалась или умерла, и статический метод getCount(),
//        который будет возвращать количество кошек

        System.out.println( "------------- УРОК 3 -------------" );

        // Кол-во кошек
        System.out.println( "Кол-во кошек: " + Cat.getCount() );
        Cat cat2 = new Cat();
        System.out.println( "Создали еще кошку, теперь кошек: " + Cat.getCount() );

        // Взорвать кошку
        cat1.feed( 9000.0 );
        System.out.println( "Взорвали одну кошку, теперь кошек: " + Cat.getCount() );

        // Попытка сходить в туалет "взорванной кошкой"
        cat1.goToilet();
        System.out.println( "Если вы не наблюдаете надпись 'Кошка сходила в туалет' значит баг исправлен" );

//        Урок 5. Создание объектов и конструктор
//
//        Создать в классе Cat ещё один конструктор так, чтобы массу кошки можно было
//        задавать при создании кошки, и создать в главном классе метод генерации кошки,
//        как описано в видеоуроке.

        System.out.println( "------------- УРОК 5 -------------" );

        Cat cat3 = new Cat( 2450.0 );
        System.out.println( "Создана новая кошка с указанным весом: " + cat3.getWeight() );

        Cat cat4 = new Cat();
        System.out.println( "Создана еще кошка без указания веса: " + cat4.getWeight() );


//        Урок 6. Инкапсуляция, геттеры и сеттеры
//
//        В классе Car проекта RoadController создать геттеры и сеттеры.
//        Создать у кошки геттер и сеттер для окраса.

        System.out.println( "------------- УРОК 6 -------------" );

        cat3.setColor( Color.BLACK );
        cat4.setColor( Color.WHITE );

        System.out.println( "Цвет кошки 3: " + cat3.getColor() );
        System.out.println( "Цвет кошки 4: " + cat4.getColor() );


//        Урок 7. Копирование объектов
//
//        Создать у кошки метод создания её “глубокой” копии.

        System.out.println( "------------- УРОК 7 -------------" );

        System.out.println( "Кол-во кошек до 'клонирования': " + Cat.getCount() );
        System.out.println( "Кошка оригинал - Вес: " + cat4.getWeight() + "; Цвет: " + cat4.getColor() + "; Съела: " + cat4.getEatenFood() + " г еды" );
        Cat cat5 = Cat.createCopy( cat4 );
        System.out.println( "Кошка копия - Вес: " + cat5.getWeight() + "; Цвет: " + cat5.getColor() + "; Съела: " + cat5.getEatenFood() + " г еды" );
        System.out.println( "Кол-во кошек после 'клонирования': " + Cat.getCount() );
    }
}