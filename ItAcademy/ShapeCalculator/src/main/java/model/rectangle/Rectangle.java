package model.rectangle;


public class Rectangle extends Square {

    private double secondSide;

    protected Rectangle(String name, double firstSide, double secondSide) {
        super(name, firstSide);
        this.secondSide = secondSide;
    }

    public Rectangle(double firstSide, double secondSide) {
        this("Прямоугольник", firstSide, secondSide );
    }

    @Override
    protected double getPerimeter() {
        return firstSide * 2 + secondSide * 2;
    }

    @Override
    protected double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
