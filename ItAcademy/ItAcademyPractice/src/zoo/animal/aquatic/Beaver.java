package zoo.animal.aquatic;

import zoo.animal.Animal;
import zoo.animal.Swimmable;

public class Beaver extends Animal implements Swimmable
{
    public Beaver() {
        super( "Бобёр", 4 );
    }

    @Override
    public String voice() {
        return "предпочитает трудиться, а не болтать";
    }

    @Override
    public String move() {
        return "медленно ходит и " + swim();
    }

    @Override
    public String swim() {
        return "уверенно плавает";
    }
}
