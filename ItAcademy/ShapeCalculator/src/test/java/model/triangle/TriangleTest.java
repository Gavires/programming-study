package model.triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest
{
    private double firstSide = 3;
    private double secondSide = 4;
    private double thirdSide = 5;
    private Triangle triangle = new Triangle( firstSide, secondSide, thirdSide );

    @Test
    @DisplayName( "Периметр треугольника" )
    void perimeterTest() {
        double expected = firstSide + secondSide + thirdSide;
        double actual = triangle.getPerimeter();
        assertEquals( expected, actual );
    }

    @Test
    @DisplayName( "Площадь треугольника" )
    void squareTest() {
        double halfPerimeter = ( firstSide + secondSide + thirdSide ) / 2;
        double expected = Math.sqrt( halfPerimeter * ( halfPerimeter - firstSide ) *
                                    ( halfPerimeter - secondSide ) * ( halfPerimeter - thirdSide ));
        double actual = triangle.getSquare();
        assertEquals( expected, actual );
    }

    @Test
    @DisplayName( "Переменная name = \"треугольник\"" )
    void nameTest() {
        assertEquals( "треугольник", triangle.getName() );
    }
}
