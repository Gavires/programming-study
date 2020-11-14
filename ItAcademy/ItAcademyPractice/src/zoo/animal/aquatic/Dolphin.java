package zoo.animal.aquatic;

import zoo.animal.Animal;
import zoo.animal.Swimmable;

public class Dolphin extends Animal implements Swimmable
{
    public Dolphin() {
        super( "Дельфин", 4 );
    }

    @Override
    public String voice() {
        return "кряяяя";
    }

    @Override
    public String move() {
        return swim();
    }

    @Override
    public String swim() {
        return "плавает грациозно!";
    }
}
