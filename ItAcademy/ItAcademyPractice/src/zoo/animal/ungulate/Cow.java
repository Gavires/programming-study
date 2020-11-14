package zoo.animal.ungulate;

import zoo.animal.Swimmable;

public class Cow extends Ungulate implements Swimmable
{
    public Cow() {
        super( "Корова", true );
    }

    @Override
    public String voice() {
        return "мууу";
    }

    @Override
    public String move() {
        return "идет неспеша и" + swim();
    }

    @Override
    public String swim() {
        return "может переплыть реку";
    }
}
