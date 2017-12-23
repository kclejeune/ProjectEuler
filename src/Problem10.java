/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
class Problem10
{
    public Problem10()
    {
        long start = System.currentTimeMillis();
        long primeSum = 2;
        for(int i = 3; i < 2000000; i += 2) //begin prime sum at 2, jump in intervals of 2 to keep odd numbers
        {
            {
                if(isPrime(i))
                {
                    primeSum += i;
                }
            }
        }
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(primeSum);
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
