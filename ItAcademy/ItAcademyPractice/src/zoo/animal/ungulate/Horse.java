package zoo.animal.ungulate;

import zoo.animal.Swimmable;

public class Horse extends Ungulate implements Swimmable
{
    public Horse() {
        super( "Лошадь", false );
    }

    @Override
    public String voice() {
        return "иго-гоо";
    }

    @Override
    public String move() {
        return "скачет очень быстро" + swim();
    }

    @Override
    public String swim() {
        return " и плавает по-лошадиному";
    }
}
