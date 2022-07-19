/*
Given a string s consisting of words and spaces, return the length of the
last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */
public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String k = s.trim();
        String[] newStr = k.split(" ");
        return newStr[newStr.length-1].length();
    }
}
