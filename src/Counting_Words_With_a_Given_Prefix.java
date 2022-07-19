/*
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s
 */

public class Counting_Words_With_a_Given_Prefix {
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        int p = pref.length();

        for(String each : words){
            if(each.length() < pref.length())continue;
            String temp = "";
            temp += each.substring(0, p);
            if(temp.equals(pref)){
                prefixCount++;
            }
        }
        return prefixCount;
    }
}
