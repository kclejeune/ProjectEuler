/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3
{
    public Problem3()
    {
        long t = 600851475143L;
        long d = 2;
        while(true)
        {
            long tmp = 600851475143L / d;
            if(t % tmp == 0 && isPrime(tmp))
            {
                System.out.println(tmp);
                break;
            }
            d++;
        }
    }
    
    private boolean isPrime(long n)
    {
        if(n == 2)
        {
            return true;
        }
        else if(n % 2 == 0) //even number so can't be prime
        {
            return false;
        }
        
        for(int i = 3; i <= Math.sqrt(n); i += 2) //number is not even or two, so begin at 3 and jump by 2
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

