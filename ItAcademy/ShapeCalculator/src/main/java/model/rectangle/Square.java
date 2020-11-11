package model.rectangle;

import model.Shape;

public class Square extends Shape {

    double firstSide;

    protected Square(String name, double firstSide) {
        super(name);
        this.firstSide = firstSide;
    }

    public Square(double firstSide) {
        this("Квадрат", firstSide);
    }

    @Override
    protected double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    protected double getSquare() {
        return Math.pow(firstSide, 2);
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
