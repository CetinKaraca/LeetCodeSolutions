/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.
 */

import java.util.Arrays;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newStr = "";
        for(String each : word1){
            newStr+=each;
        }
        String str = "";
        for(String each : word2){
            str+=each;
        }

        char[] first = newStr.toCharArray();
        char[] second = str.toCharArray();
        return Arrays.equals(first, second);
    }
}
