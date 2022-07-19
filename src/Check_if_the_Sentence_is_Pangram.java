/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */

import java.util.Arrays;

public class Check_if_the_Sentence_is_Pangram {
    public boolean checkIfPangram(String sentence) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaArr = alphabet.toCharArray();

        String str = "";

        for(int i = 0; i < sentence.length(); i++){
            if(!str.contains(""+sentence.charAt(i))){
                str += "" + sentence.charAt(i);
            }
        }

        char[] strArr = str.toCharArray();

        Arrays.sort(strArr);

        return Arrays.equals(strArr, alphaArr);
    }
}
