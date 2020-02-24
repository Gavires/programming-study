public class Cat {
    public static int count = 0;

    private final int EYES_COUNT = 2;
    private final double MIN_WEIGHT = 1000.0;
    private final double MAX_WEIGHT = 9000.0;

    private Color color;
    private double originWeight;
    private double weight;
    private double eatenFood;
    private boolean isAlive = true;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat( Double weight ) {
        this();
        this.weight = weight;
    }

    private void checkStatus() {
        String status = getStatus();

        if ( isAlive == true ) {
            if ( status.equals( "Dead" ) || status.equals( "Exploded" ) ) {
                count--;
                isAlive = false;
            }
        }
    }

    public void meow() {
        if ( isAlive == true ) {
            weight = weight - 1;
            System.out.println( "Meow" );
            checkStatus();
        }
    }

    public void feed( Double amount ) {
        if ( isAlive = true ) {
            weight += amount;
            eatenFood += amount;
            checkStatus();
        }
    }

    public void drink( Double amount ) {
        if ( isAlive == true ) {
            weight = weight + amount;
            checkStatus();
        }
    }

    public void goToilet() {
        if ( isAlive == true ) {
            weight -= 50;
            System.out.println( "Кошка сходила в туалет" );
            checkStatus();
        }
    }

    public void setColor( Color color ) {
        this.color = color;
    }

    public void setWeight( Double weight ) {
        this.weight = weight;
    }

    public void setEatenFood( Double eatenFood ) {
        this.eatenFood = eatenFood;
    }

    public Color getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public double getEatenFood() {
        return eatenFood;
    }

    public String getStatus() {
        if( weight < MIN_WEIGHT ) {
            return "Dead";
        }
        else if( weight > MAX_WEIGHT ) {
            return "Exploded";
        }
        else if( weight > originWeight ) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static int getCount() {
        return count;
    }

    public static Cat createCopy( Cat original ) {
        Cat copy = new Cat();
        copy.setWeight( original.getWeight() );
        copy.setEatenFood( original.getEatenFood() );
        copy.setColor( original.getColor() );
        return copy;
    }
}