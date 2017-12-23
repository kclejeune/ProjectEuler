/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
class Problem9
{
    public Problem9()
    {
        long start = System.currentTimeMillis();
        for(int a = 0; a < 1000; a++)
        {
            for(int b = 0; b < 1000; b++)
            {
                for(int c = 0; c < 1000; c++)
                {
                    if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000 && a < b && b < c)
                    {
                        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
                        System.out.println("a = " + a);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("Product: " + a * b * c);
                        break;
                    }
                }
            }
        }
    }
}
