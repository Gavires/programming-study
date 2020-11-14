package zoo.animal.ungulate;

public class Giraffe extends Ungulate
{
    public Giraffe() {
        super( "Жираф", true );
    }

    @Override
    public String voice() {
        return "Ааааээээ";
    }

    @Override
    public String move() {
        return "ходит неустойчиво";
    }
}
