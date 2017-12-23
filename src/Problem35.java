/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves
 * prime.
 * <p>
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 * <p>
 * How many circular primes are there below one million?
 */
public class Problem35
{
    private int circularPrimeCount = 0;
    
    public Problem35()
    {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++)
        {
            if(isCircularPrime(i))
            {
                circularPrimeCount++;
            }
        }
        
        System.out.println(circularPrimeCount);
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + "ms");
    }
    
    public boolean isCircularPrime(int n)
    {
        String num = String.valueOf(n);
        if(isPrime(n))
        {
            for(int i = 0; i < num.length(); i++)
            {
                num = num.substring(num.length() - 1, num.length()) + num.substring(0, num.length() - 1);
                if(!isPrime(Long.valueOf(num)))
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        
        return true;
    }
    
    private boolean isPrime(long n)
    {
        if(n == 2 || n % 2 == 0) //even number so can't be prime
        {
            return false;
        }
        
        for(int i = 3; i <= Math.sqrt(n); i += 2) //number is not even or two, begin at 3 and jump by 2
        // until sqrt of n
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
