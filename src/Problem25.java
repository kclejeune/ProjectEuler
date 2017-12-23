import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * <p>
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * <p>
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 * <p>
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
class Problem25
{
    
    public Problem25()
    {
        long start = System.currentTimeMillis();
        long count = 3;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger currentValue = a.add(b);
        while(currentValue.toString().length() != 1000)
        {
            a = b;
            b = currentValue;
            currentValue = a.add(b);
            count++;
        }
        System.out.println(count);
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
    }
}

