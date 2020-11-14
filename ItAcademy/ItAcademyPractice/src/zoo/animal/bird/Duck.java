package zoo.animal.bird;

import zoo.animal.Flyable;
import zoo.animal.Swimmable;

public class Duck extends Bird implements Flyable, Swimmable
{
    public Duck() {
        super( "Утка", true );
    }

    @Override
    public String voice() {
        return "кря-кря";
    }

    @Override
    public String move() {
        return "ходит, " + swim() + " и " + fly();
    }

    @Override
    public String fly() {
        return "летает";
    }

    @Override
    public String swim() {
        return "плавает";
    }
}
