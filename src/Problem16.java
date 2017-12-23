/*
  215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
  What is the sum of the digits of the number 2^1000?
 */

import java.math.BigInteger;

class Problem16
{
    public Problem16()
    {
        long start = System.currentTimeMillis();
        BigInteger number = new BigInteger("2").pow(1000);
        String stringNum = String.valueOf(number);
        int total = 0;
        for(int i = 0; i < stringNum.length(); i++)
        {
            int currentValue = Integer.parseInt(stringNum.substring(i, i + 1));
            total += currentValue;
        }
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(total);
    }
}
