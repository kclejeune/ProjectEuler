/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem5
{
    public Problem5()
    {
        long start = System.currentTimeMillis();
        int z = 2520;
        while(true)
        {
            if(divisible(z))
            {
                System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
                System.out.println(z);
                break;
            }
            z += 2520;
        }
    }
    
    private boolean divisible(long i)
    {
        for(int n = 1; n < 21; n++)
        {
            if(i % n != 0)
            {
                return false;
            }
        }
        return true;
    }
}
