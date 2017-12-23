/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
 * sum.
 */
class Problem6
{
    public Problem6()
    {
        long start = System.currentTimeMillis();
        int sum1 = 0;
        int sum2 = 0;
        int difference;
        for(int i = 1; i <= 100; i++)
        {
            sum1 += Math.pow(i, 2);
        }
        for(int i = 1; i <= 100; i++)
        {
            sum2 += i;
        }
        sum2 *= sum2;
        
        difference = Math.abs(sum2 - sum1);
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(difference);
    }
}

