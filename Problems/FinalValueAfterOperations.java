import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class FinalValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X"))
                answer += 1;
            else
                answer -= 1;
        }
        return answer;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {

            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j))
                    count++;
            }
        }
        return count;
    }

    public static int mostWordsFound(String[] sentences) {
        int[] maxwords = new int[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                char[] sentence = sentences[i].toCharArray();
                for (int k = 0; k < sentence.length; k++) {
                    if (sentence[k] == (' '))
                        count++;
                }
                maxwords[i] = count + 1;
            }

        }
        int max = 0;
        for (int a = 0; a < maxwords.length; a++) {
            if (maxwords[a] > max)
                max = maxwords[a];
        }
        return max;
    }

    public int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    a = i;
                b = j;
            }
        }
        int[] twosum = { a, b };
        // for(int k=0;k<2;k++){
        // System.out.println(twosum[k]);
        // }
        return twosum;

    }

    public int reverse1(int x) {
        StringBuilder num = new StringBuilder("");
        int result;
        int rem, m;
        int number = Math.abs(x);

        rem = number % 10;
        num.append(rem);
        m = number / 10;
        rem = m % 10;
        num.append(rem);
        m = number / 100;
        num.append(m);

        result = Integer.valueOf(num.toString());
        if (x < 0)
            result = result * -1;

        if ((result > Math.pow(2, 31) - 1) || (result < Math.pow(-2, 31)))
            return 0;
        else
            return result;

    }

    public int reverse(int x) {
        int reverse = 0;
        if (x <= Integer.MIN_VALUE && x >= Integer.MAX_VALUE) {
            return 0;
        } else if (x == 0) {
            return 0;
        } else {
            int number = Math.abs(x);
            while (number > 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            if (x < 0)
                return reverse * -1;
            else
                return reverse;
        }

        // if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE)
        // return (int)reverse;
        // else
        // return 0;

    }

    // public boolean isPalindrome(int x) {
    // int reverse = 0;
    // boolean isPalindrome = false;
    // if (x < 0) {
    // isPalindrome = false;
    // return isPalindrome;
    // } else {
    // while (x > 0) {
    // int remainder = x % 10;
    // reverse = reverse * 10 + remainder;
    // x = x / 10;
    // }
    // if (x == reverse) {
    // isPalindrome = true;
    // }
    // return isPalindrome;
    // }
    // }

    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;

        if (x < 0) {
            isPalindrome = false;
        } else if (x == 0) {
            isPalindrome = true;
        } else {
            String num = new String(Integer.toString(x));
            String rev = "";

            for (int i = num.length() - 1; i >= 0; i--)
                rev += num.charAt(i);

            if (rev.equals(num))
                isPalindrome = true;
        }
        return isPalindrome;
    }

    public int removeDuplicates(int[] nums) {
        SortedSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }
        return numbers.size();

    }

    public static boolean detectCapitalUse(String word) {
        boolean capitalUse = true;
        // CASE1: if the first letter is capital
        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 65 && word.charAt(i) <= 90))
                    capitalUse = false;
                    break;
            }
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122))
                    capitalUse = false;
                    break;
            }
        }
        // CASE2: if the first letter is smallcase
        if (word.charAt(0) >= 97 && word.charAt(0) <= 122) {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 97 && word.charAt(i) <= 122)
                    capitalUse = true;
            }
        }
        return capitalUse;
    }

    public static void main(String... m) {
        // String[] operations = {"X++","++X","--X","X++"};
        // System.out.println(finalValueAfterOperations(operations));
        // System.out.println(numJewelsInStones("aA","aAAbA"));
        // String[] sentences = { "My name is Rachita.", "this is a very very good
        // book.", "sleep tight." };
        // System.out.println(mostWordsFound(sentences));
        // FinalValueAfterOperations op = new FinalValueAfterOperations();
        // int array[] = { 2, 3, 5, 4, 4, 0, 2 };
        // System.out.println(op.removeDuplicates(array));

        // System.out.println(op.twoSum(array, 6));
        // System.out.println(op.reverse(-457));
        // System.out.println(op.isPalindrome(-457));
        // System.out.println(op.isPalindrome(0));
        // System.out.println(op.isPalindrome(457));
        // System.out.println(op.isPalindrome(1223221));
        // System.out.println(detectCapitalUse("Capital"));
        // System.out.println(detectCapitalUse("capithjdhkjal"));
        System.out.println(detectCapitalUse("CaPPital"));
        // System.out.println(detectCapitalUse("LIOOJGHGJDGJ"));

    }
}