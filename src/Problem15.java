import java.math.BigInteger;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are
 * exactly 6 routes to the bottom right corner.
 * How many possible routes are there in a 20x20 grid?
 */
class Problem15
{
    public Problem15()
    {
        long start = System.currentTimeMillis();
        //40 total moves, answer must equal the combination of 40 taking 20 (possible moves either up or right)
        int totalMoves = 40;
        int totalDirectionMoves = 20;
        BigInteger denominator = factorial(totalDirectionMoves).multiply(factorial
                (totalMoves - totalDirectionMoves));
        BigInteger result = factorial(totalMoves).divide(denominator);
        long stop = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Runtime: " + (stop - start) + "ms");
    }
    
    private BigInteger factorial(int n)
    {
        BigInteger total = new BigInteger("1");
        for(int i = n; i > 1; i--)
        {
            total = total.multiply(new BigInteger(String.valueOf(i)));
        }
        
        return total;
    }
}
