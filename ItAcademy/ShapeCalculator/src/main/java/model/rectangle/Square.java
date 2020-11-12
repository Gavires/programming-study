package model.rectangle;


public class Square extends Rectangle {


    protected Square(String name, double side) {
        super(name, side, side);
        this.firstSide = side;
    }

    public Square(double side) {
        this("Квадрат", side);
    }

    @Override
    protected double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nСторона: ").append(firstSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
