/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */

public class First_Unique_Char_in_a_String {
    public int firstUniqChar(String s) {

        for(char each : s.toCharArray()){
            int first = s.indexOf(each);
            int last = s.lastIndexOf(each);
            if(first == last) return first;
        }
        return -1;
    }
}
