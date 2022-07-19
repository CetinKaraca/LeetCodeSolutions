/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
 */

import java.util.Arrays;

public class Palindrome_Number {

    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String[] newStr = String.valueOf(x).split(""); //newStr = {"1", "2", "1"};
        String[] empty = new String[newStr.length];

        int index = 0;
        for(int i = newStr.length-1; i >= 0; i--){
            empty[index++] = newStr[i];
        }

        return Arrays.equals(newStr, empty) ? true : false;

    }
}
