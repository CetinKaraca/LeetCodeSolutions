/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {

        s = s.trim().replaceAll(" +", " "); //regex expr to get rid of extra spaces bw two words

        String[] newStr = s.split(" ");
        String str = "";

        for(int i = newStr.length - 1; i >= 0; i--){
            str += newStr[i] + " ";
        }

        return str.trim();

    }
}
