package solutions.s41to50;

import utils.FileUtils;
import utils.TriangleNumbers;

import java.util.List;

/**
 * Problem 42:
 * <p>
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value.
 * For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
 */

public class Problem42 {

    public static void main(String args[]) throws Exception {
        System.out.println(getTriangleWordsCount());
    }

    private static int getTriangleWordsCount() throws Exception {
        String fileContent = FileUtils.read("p042_words.txt");
        fileContent = fileContent.replace("\"", "");
        String[] words = fileContent.split(",");

        List<Long> triangleNumbers = TriangleNumbers.triangleNumbers(1000);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (triangleNumbers.contains((long)convertWordToNumber(words[i])))
                count++;
        }
        return count;
    }

    private static int convertWordToNumber(String word) {
        int number = 0;
        for (int i = 0; i < word.length(); i++) {
            number += word.charAt(i) - 'A' + 1;
        }
        return number;
    }
}
