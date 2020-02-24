public class Loader {

    public static void main( String[] args) {
        System.out.println( "Целые числа" );
        System.out.println( "byte min: " + Byte.MIN_VALUE + "; max: " + Byte.MAX_VALUE );
        System.out.println( "int min: " + Integer.MIN_VALUE + "; max: " + Integer.MAX_VALUE );
        System.out.println( "short min: " + Short.MIN_VALUE + "; max: " + Short.MAX_VALUE );
        System.out.println( "long min: " + Long.MIN_VALUE + "; max: " + Long.MAX_VALUE );

        System.out.println( "С плавающей точкой" );
        System.out.println( "float min: " + Float.MIN_VALUE + "; max: " + Float.MAX_VALUE );
        System.out.println( "double min: " + Double.MIN_VALUE + "; max: " + Double.MAX_VALUE );
    }
}
