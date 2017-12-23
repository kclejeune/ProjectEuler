/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19
 * letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p>
 * <p>
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 * (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 */
class Problem17
{
    public Problem17()
    {
        long start = System.currentTimeMillis();
        int numberOfCharacters = 0;
        for(int i = 1; i <= 1000; i++)
        {
            numberOfCharacters += numToText(i).length();
            System.out.println(numToText(i));
        }
        System.out.println("Runtime: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(numberOfCharacters + " Characters Total");
    }
    
    private String numToText(int n)
    {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred",
                "sevenhundred", "eighthundred", "ninehundred"};
        String result = "";
        String numString = String.valueOf(n);
        switch(numString.length())
        {
            case 1:
                result = ones[n - 1];
                break;
            case 2:
                if(numString.substring(0, 1).equals("1"))
                {
                    switch(Integer.valueOf(numString.substring(1, 2)))
                    {
                        case 0:
                            result = "ten";
                            break;
                        case 1:
                            result = "eleven";
                            break;
                        case 2:
                            result = "twelve";
                            break;
                        case 3:
                            result = "thirteen";
                            break;
                        case 4:
                            result = "fourteen";
                            break;
                        case 5:
                            result = "fifteen";
                            break;
                        case 6:
                            result = "sixteen";
                            break;
                        case 7:
                            result = "seventeen";
                            break;
                        case 8:
                            result = "eighteen";
                            break;
                        case 9:
                            result = "nineteen";
                    }
                }
                else
                {
                    result = tens[Integer.valueOf(numString.substring(0, 1)) - 1];
                    
                    if(!numString.substring(1, 2).equals("0"))
                    {
                        result += ones[Integer.valueOf(numString
                                .substring(1, 2)) - 1];
                    }
                }
                break;
            case 3:
                if(numString.substring(1, 2).equals("0"))
                {
                    switch(numString.substring(1, 3))
                    {
                        case "00":
                            result = hundreds[Integer.valueOf(numString.substring(0, 1)) - 1];
                            break;
                        default:
                            result = hundreds[Integer.valueOf(numString.substring(0, 1)) - 1] + "and" + ones[Integer
                                    .valueOf(numString.substring(2, 3)) - 1];
                            break;
                    }
                }
                else
                {
                    result = hundreds[Integer.valueOf(numString.substring(0, 1)) - 1] + "and" + numToText(Integer
                            .valueOf(numString.substring(1, 3)));
                }
                break;
            case 4:
                result = "onethousand";
                break;
        }
        return result;
    }
}