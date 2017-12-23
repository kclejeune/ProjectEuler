import java.util.ArrayList;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1,
 * 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:
 * <p>
 * 012   021   102   120   201   210
 * <p>
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Problem24
{
    ArrayList<Integer> digits = new ArrayList<>();
    
    public Problem24()
    {
        for(int i = 1; i < 10; i++)
        {
            digits.add(i);
        }
        
        int permutationNumber = 0;
        int count = 0;
        while(permutationNumber != 1000000)
        {
            if(isPermutation(String.valueOf(count)))
            {
                permutationNumber++;
            }
        }
    }
    
    public boolean isPermutation(String num)
    {
        
        return true;
    }
    
    public ArrayList<Integer> toIntArray(String num)
    {
        ArrayList<Integer> newDigits = new ArrayList<>();
        for(int i = 0; i < num.length(); i++)
        {
            newDigits.add(Integer.valueOf(num.substring(i, i + 1)));
        }
        return newDigits;
    }
}
