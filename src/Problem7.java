/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
class Problem7
{
    public Problem7()
    {
        long start = System.currentTimeMillis();
        int i = 3;
        int numberOfPrimes = 1;
        while(true)
        {
            if(isPrime(i))
            {
                numberOfPrimes++;
            }
            if(numberOfPrimes == 10002)
            {
                System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
                System.out.println(i);
                break;
            }
            i += 2;
        }
    }
    
    private boolean isPrime(int n)
    {
        if(n == 2 || n % 2 == 0) //even number so can't be prime
        {
            return false;
        }
        
        for(int i = 3; i <= Math.sqrt(n); i += 2) //number is not even or two, begin at 3 and jump by 2
        {                                         // until half of n
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
