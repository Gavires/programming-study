package zoo.animal.bird;

import zoo.animal.Flyable;

public class Pigeon extends Bird implements Flyable
{
    public Pigeon() {
        super( "Голубь", true );
    }

    @Override
    public String voice() {
        return "курлык-курлык";
    }

    @Override
    public String move() {
        return "ходит и " + fly();
    }

    @Override
    public String fly() {
        return "летает по голубиному";
    }
}
