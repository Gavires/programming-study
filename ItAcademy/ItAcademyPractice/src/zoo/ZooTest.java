package zoo;

import zoo.animal.Animal;
import zoo.animal.aquatic.Beaver;
import zoo.animal.aquatic.Whale;
import zoo.animal.bird.Chicken;
import zoo.animal.bird.Duck;
import zoo.animal.bird.Pigeon;
import zoo.animal.ungulate.Cow;
import zoo.animal.ungulate.Giraffe;
import zoo.animal.ungulate.Horse;

public class ZooTest
{
    //TODO Разработать иерархию из следующих классов, необходимых для реализации модели зоопарка:
    // - животные 4 типов: копытные, пернатые, водоплавающие, рептилии;
    // - вольеры  4 типов: открытые вольеры, покрытые сеткой вольеры, аквариумы, террариумы.
    // Для каждого из классов реализовать переопределенный метод абстрактного
    // класса «животное», обладающего общими параметрами (вес, возраст), который будет
    // расселять животных в соответствующие вольеры. В основном методе программы
    // сформировать зоопарк и организовать вывод списка вольеров и обитающих в них животных.

    public static void main( String[] args )
    {
        Animal[] animals = {
                new Cow(),
                new Horse(),
                new Giraffe(),
                new Chicken(),
                new Pigeon(),
                new Duck(),
                new Whale(),
                new Beaver()
        };

        for ( Animal animal : animals ) {
            System.out.println( animal );
        }
    }
}
