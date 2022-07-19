/*
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.
 */

public class Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(""+ch)){
            return word;
        }

        int indexOfch = word.indexOf(""+ch);
        String str = "";
        for(int i = indexOfch; i >= 0; i--){
            str += word.charAt(i);
        }

        str += word.substring(indexOfch+1);

        return str;
    }
}
