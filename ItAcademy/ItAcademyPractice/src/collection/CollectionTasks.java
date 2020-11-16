package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTasks
{
    //TODO Создать класс Box, содержащий следующие характеристики коробки: длина, ширина, высота, вес.
    // Создать коллекцию, содержащую объекты класса Box, и выполнить над её элементами следующие операции:
    // а. вычислить суммарный объём и суммарный вес всех коробок;
    // б. вывести на экран размеры самой лёгкой и самой тяжёлой коробок;
    // в. удалить из коллекции все коробки, объём которых превышает 100 литров;
    // г. распределить коробки по двум другим коллекциям в зависимости от их веса:
    // если вес коробки меньше или равен среднему весу всех коробок, считать коробку лёгкой, иначе – тяжёлой.
    public static void main( String[] args )
    {
        final int BOX_COUNT = 200;
        List<Box> boxes = new ArrayList<>( 200 );

        for ( int i = 0; i < BOX_COUNT; i++ ) {
            boxes.add( new Box( getRandom(), getRandom(), getRandom() ,getRandom() ));
        }

        int sumVolume = 0;
        int sumWeight = 0;
        for ( Box box : boxes ) {
            sumVolume += box.getVolume();
            sumWeight += box.getWeight();
        }
        System.out.println( "a.\n\tсуммарный объем: " + sumVolume + "\n\tсуммарный вес: " + sumWeight );

        Box lightWeightBox = getLightWeightBox( boxes );
        Box heaviestWeightBox = getHeaviestWeight( boxes );

        int averageWeight = sumWeight / boxes.size();
        List<Box> lightBoxes = new ArrayList<>();
        List<Box> heavyBoxes = new ArrayList<>();
        for( Box box : boxes ) {
            if( box.getWeight() < averageWeight ) {
                lightBoxes.add( box );
            }
            else {
                heavyBoxes.add( box );
            }
        }
        System.out.println( "г.\n\tсредний вес коробок: " + averageWeight +
                "\n\tКол-во легких коробок: " + lightBoxes.size() +
                "\n\tКол-во тяжелых коробок: " + heavyBoxes.size() );

        System.out.println( "б.\n\tразмеры самой легкой коробки:  " +
                lightWeightBox.getLength() + " x " +
                lightWeightBox.getWidth()  + " x " +
                lightWeightBox.getWeight() +
                "\n\tразмеры самой тяжелой коробки: " +
                heaviestWeightBox.getLength() + " x " +
                heaviestWeightBox.getWidth()  + " x " +
                heaviestWeightBox.getWeight());

        int deletedBoxCount = 0;
        for (int i = 0; i < boxes.size(); i++) {
            Box box = boxes.get( i );
            if( box.getVolume() > 100 ) {
                boxes.remove( box );
                deletedBoxCount++;
            }
        }
        System.out.println( "в.\n\tКол-во удаленных коробок с объемом больше 100: " + deletedBoxCount );
    }

    private static byte getRandom() {
        return (byte) ( 4 + Math.random() * 8 );
    }

    private static Box getLightWeightBox( List<Box> boxes ) {
        Box lightWeightBox = new Box( 1, 1, 1, Byte.MAX_VALUE );
        for ( Box box : boxes )
        {
            if ( box.getWeight() < lightWeightBox.getWeight() )
            {
                lightWeightBox = box;
            }
        }
        return lightWeightBox;
    }

    private static Box getHeaviestWeight( List<Box> boxes ) {
        Box heaviestBox = new Box( 1, 1, 1, Byte.MIN_VALUE );
        for ( Box box : boxes )
        {
            if ( box.getWeight() > heaviestBox.getWeight() )
            {
                heaviestBox = box;
            }
        }
        return heaviestBox;
    }
}
