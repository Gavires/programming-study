public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println( sumDigits( container.count ) );
    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        String dig = number.toString();
        int result = 0;

        for ( int i = 0; i < dig.length(); i++ ) {
            result += Character.getNumericValue( dig.charAt(i) );
        }
        return result;
    }
}
