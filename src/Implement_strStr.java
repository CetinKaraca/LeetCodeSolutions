/*
Implement strStr().
Given two strings needle and haystack, return the index of the first
occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Implement_strStr {

    public int strStr(String haystack, String needle) {
        int indexOfNeedle = 0;
        if(haystack.contains(needle)){
            indexOfNeedle = haystack.indexOf(needle);
        } else {
            indexOfNeedle = -1;
        }
        return indexOfNeedle;
    }
}
