/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
class Problem14
{
    
    public Problem14()
    {
        long start = System.currentTimeMillis();
        long nextNum;
        long chainCount;
        long maxChainCount = 0;
        long maxChainCountStart = 0;
        for(int i = 2; i < 1000000; i++)
        {
            nextNum = i;
            chainCount = 1;
            while(nextNum != 1)
            {
                if(nextNum % 2 == 0)
                {
                    nextNum /= 2;
                }
                else
                {
                    nextNum = (nextNum * 3 + 1);
                }
                chainCount++;
            }
            if(chainCount > maxChainCount)
            {
                maxChainCount = chainCount;
                maxChainCountStart = i;
            }
        }
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(maxChainCountStart);
    }
}
