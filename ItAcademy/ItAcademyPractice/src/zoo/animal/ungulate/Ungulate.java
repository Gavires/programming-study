package zoo.animal.ungulate;

import zoo.animal.Animal;

/**
 * Копытные
 */

public abstract class Ungulate extends Animal
{
    protected boolean hasHorns;

    protected Ungulate( String name, boolean hasHorns ) {
        super( name, 4 );
        this.hasHorns = hasHorns;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder( super.toString() );
        builder.append( "\n\tесть рога? ").append( hasHorns );
        return builder.toString();
    }
}
