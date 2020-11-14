package zoo.animal.bird;

import zoo.animal.Animal;

/**
 * Пернатые
 */

public abstract class Bird extends Animal
{
    boolean canFly;

    protected Bird( String name, boolean canFly ) {
        super( name, 2 );
        this.canFly = canFly;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder( super.toString() );
        builder.append( "\n\tумеет летать? ").append( canFly );
        return builder.toString();
    }
}
