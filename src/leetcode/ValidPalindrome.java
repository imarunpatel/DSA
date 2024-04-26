package leetcode;

//A phrase is a palindrome if, after converting all uppercase
// letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.

public class ValidPalindrome {

    static boolean validPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                builder.append(ch);
            }
        }
        String newString = builder.toString();
        String reversed = builder.reverse().toString();
        return newString.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("A man, a plan, a canal: Panama"));;
    }
}
