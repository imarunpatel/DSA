package leetcode;

import java.util.ArrayList;

//Given an integer x, return true if x is a palindrome, and false otherwise
public class PalindromeNumber {
    public static void main(String[] args) {
        String str = "Hello";
        int number = -121;
        System.out.println(number);
        PalindromeNumber obj = new PalindromeNumber();
        System.out.print(obj.isPalindrome(number));
    }

    boolean isPalindrome(int number) {
        int value = number;
        int reversed = 0;

        if(value < 0) {
            return false;
        }

        while(value != 0) {
            int reminder = value%10;
            reversed = reversed * 10 + reminder;
            value = value/10;
        }

        return number == reversed;
    }
}
