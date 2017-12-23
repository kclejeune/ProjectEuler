/*
  A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example,
  the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
  <p>
  A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this
  sum exceeds n.
  <p>
  As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of
  two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be
  written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even
  though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than
  this limit.
  <p>
  Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

import java.util.ArrayList;

public class Problem23
{
    ArrayList<Integer> abundantNumbers = new ArrayList<>();
    boolean[] abundantSumPossible = new boolean[28123];
    
    public Problem23()
    {
        long start = System.currentTimeMillis();
        /*
          Creates arrayList of all abundant numbers below given constraints
         */
        for(int i = 12; i <= 28111; i++)
        {
            if(isAbundant(i))
            {
                abundantNumbers.add(i);
            }
        }
        /**
         * nested loop sets boolean array value true if number can be written as an "abundant sum"
         */
        for(int i = 0; i < abundantNumbers.size(); i++)
        {
            for(int n = 0; n < abundantNumbers.size(); n++)
            {
                int sum = abundantNumbers.get(i) + abundantNumbers.get(n);
                if(sum < abundantSumPossible.length)
                {
                    abundantSumPossible[sum] = true;
                }
            }
        }
        
        int total = 0;
        for(int i = 0; i < abundantSumPossible.length; i++)
        {
            if(!abundantSumPossible[i])
            {
                total += i;
            }
        }
        System.out.println(total);
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + "ms");
    }
    
    /**
     * @param n
     * @return all proper divisors of param as ArrayList
     */
    public ArrayList<Integer> properDivisors(int n)
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
    
    /**
     * @param n
     * @return true or false value if a number is "abundant" given definition above
     */
    public boolean isAbundant(int n)
    {
        ArrayList<Integer> divisors = properDivisors(n);
        int total = 0;
        for(int i : divisors)
        {
            total += i;
        }
        
        return total > n;
    }
}


