package palindrome;

abstract public class PalindromeChecker
{
    public static boolean isPalindrome( String value )
    {
        char[] chars = value.toCharArray();

        int rightIndex = chars.length - 1;
        for ( int leftIndex = 0; leftIndex < chars.length; leftIndex++ )
        {
            if ( leftIndex == rightIndex )
                break;

            if ( chars[ leftIndex ] != chars[ rightIndex ])
                return false;

            rightIndex--;
        }
        return true;
    }
}
