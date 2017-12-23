/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4
{
    public Problem4()
    {
        int largestPalindrome = 0;
        for(int i = 100; i < 1000; i++)
        {
            for(int ii = 100; ii < 1000; ii++)
            {
                if(isPalindrome(String.valueOf(i * ii)))
                {
                    if(i * ii > largestPalindrome)
                    {
                        largestPalindrome = i * ii;
                    }
                }
            }
        }
        System.out.println(largestPalindrome);
    }
    
    private boolean isPalindrome(String number)
    {
        return number.equals(new StringBuilder(number).reverse().toString());
    }
}
