import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * <p>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Find the sum of the digits in the number 100!
 */
class Problem20
{
    double factorial;
    
    public Problem20()
    {
        long start = System.currentTimeMillis();
        BigInteger originalNumber = new BigInteger("100");
        String stringNum = String.valueOf(factorialFinder(originalNumber));
        int sum = 0;
        int currentValue;
        for(int i = 0; i < String.valueOf(stringNum).length(); i++)
        {
            currentValue = Integer.parseInt(stringNum.substring(i, i + 1));
            sum += currentValue;
        }
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(sum);
    }
    
    private BigInteger factorialFinder(BigInteger originalNumber)
    {
        if(originalNumber.equals(new BigInteger("1")))
        {
            return new BigInteger("1");
        }
        else
        {
            return originalNumber.multiply(factorialFinder(originalNumber.subtract(new BigInteger("1"))));
        }
    }
}
