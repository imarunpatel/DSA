package leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.print(findLastWordLengthV2("this is the test code of java"));
    }

    static int findLastWordLength(String str) {
        String[] words = str.split("\\s+");
        return words[words.length-1].length();
    }

    static int findLastWordLengthV2(String str) {
        String sentence = str.trim();

        int count = 0;
        for(int i = sentence.length() - 1; i >= 0; i--) {
            if(sentence.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }
        return count;
    }
}
