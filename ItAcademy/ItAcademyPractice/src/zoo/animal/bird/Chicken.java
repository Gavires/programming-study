package zoo.animal.bird;

import zoo.animal.Flyable;

public class Chicken extends Bird implements Flyable
{

    public Chicken() {
        super( "Курица", false );
    }

    @Override
    public String voice() {
        return "ко-ко-кооо";
    }

    @Override
    public String move() {
        return "бегает неуклюже и " + fly();
    }

    @Override
    public String fly() {
        return "плавает как цыпа";
    }
}
