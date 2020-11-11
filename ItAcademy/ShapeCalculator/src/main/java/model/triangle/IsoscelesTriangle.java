package model.triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side, double base) {
        super("Равнобедренный треугольник", side, side, base);
    }

    @Override
    public double getPerimeter() {
        return firstSide * 2 + thirdSide;
    }

    @Override
    public double getSquare() {
        return thirdSide * Math.sqrt(Math.pow(firstSide, 2) -
                Math.pow(thirdSide, 2) / 4) / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nБоковая сторона: ").append(firstSide);
        builder.append("\nОснование: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
