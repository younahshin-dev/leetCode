package Algorithms;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 58. Length of Last Word

 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 * */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        //s = s.replaceAll("\\s+", " "); //굳이 공백갯수 신경 쓰지 않아도 split 하면 하나로 바뀌어 지느건가?
        String[] arrayWord = s.split(" ");
        return arrayWord[arrayWord.length -1].length();

//        s = s.replaceAll("\\s+", " ");
//        String temp = "";
//        String[] arrayWord = s.split(" ");
//        temp = arrayWord[arrayWord.length -1];
//
//        return temp.length();
    }

    @Test
    public void test_LengthOfLastWord() {

        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWord(s);

        assertEquals(4, result);

    }
}
