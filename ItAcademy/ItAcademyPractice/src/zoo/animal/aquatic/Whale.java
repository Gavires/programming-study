package zoo.animal.aquatic;

import zoo.animal.Animal;
import zoo.animal.Swimmable;

public class Whale extends Animal implements Swimmable
{
    public Whale() {
        super( "Кит", 3 );
    }

    @Override
    public String voice() {
        return "уыы-ууу";
    }

    @Override
    public String move() {
        return swim();
    }

    @Override
    public String swim() {
        return "плавает по-китовьи в океане";
    }
}
