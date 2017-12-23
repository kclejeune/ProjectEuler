import java.io.File;
import java.util.*;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first
 * names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is
 * the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 */
class Problem22
{
    private Scanner scan;
    
    public Problem22()
    {
        long start = System.currentTimeMillis();
        try
        {
            scan = new Scanner(new File("/Users/casey888/Desktop/names.txt")).useDelimiter(",");
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        ArrayList<String> names = new ArrayList<>();
        while(scan.hasNext())
        {
            names.add(scan.next());
        }
        scan.close();
        Collections.sort(names);
        Hashtable<Character, Integer> alphabet = new Hashtable<>(26);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < letters.length(); i++)
        {
            alphabet.put(letters.charAt(i), i + 1);
        }
        int nameScore = 0;
        int listTotal = 0;
        for(int i = 0; i < names.size(); i++)
        {
            for(int currentChar = 1; currentChar < names.get(i).length() - 1; currentChar++)
            {
                nameScore += alphabet.get(names.get(i).charAt(currentChar));
            }
            
            listTotal += nameScore * (i + 1);
            nameScore = 0;
        }
        System.out.println(listTotal);
        long totalTime = System.currentTimeMillis() - start;
        System.out.println("Runtime: " + totalTime + "ms");
    }
}
