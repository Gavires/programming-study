package zoo.animal;

public abstract class Animal
{
    private static final int WEIGHT_MIN = 1;
    private static final int WEIGHT_MAX = 80;
    private static final int AGE_MIN = 1;
    private static final int AGE_MAX = 10;

    private String name;
    private String description;
    private double weight;
    private int age;
    private int limbCount;

    protected Animal( String name, int limbCount) {
        this.name = name;
        this.limbCount = limbCount;
        weight = getRandomInRange( WEIGHT_MIN, WEIGHT_MAX );
        age = (int) getRandomInRange( AGE_MIN, AGE_MAX );
    }

    private double getRandomInRange( int from, int to ) {
        return from + ( Math.random() * to );
    }

    public abstract String voice();
    public abstract String move();

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getLimbCount() {
        return limbCount;
    }

    @Override
    public String toString() {
        if ( description == null ) {
            StringBuilder builder = new StringBuilder();
            builder.append( name )
                    .append( ":\n\tчто говорит? ").append( voice() )
                    .append( "\n\tкак передвигается? ").append( move() )
                    .append( "\n\tвес: ").append( weight )
                    .append( "\n\tвозраст: ").append( age )
                    .append( "\n\tкол-во конечностей: ").append(limbCount);
            description = builder.toString();
        }
        return description;
    }
}
