/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */

import java.util.Arrays;

public class Sorting_the_Sentence {
    public String sortSentence(String s) {
        String[] newArr = s.split(" ");
        String[] sortArr = new String[newArr.length];

        for(int i = 0; i < newArr.length; i++){
            sortArr[i] = ""+ newArr[i].charAt(newArr[i].length()-1) + "" + newArr[i];
        }

        Arrays.sort(sortArr);

        String finalStr = "";

        for(int j = 0; j < sortArr.length; j++){
            for(int k = 0; k < sortArr[j].length(); k++){
                if(Character.isDigit(sortArr[j].charAt(k))){
                    continue;
                }
                finalStr += ""+ sortArr[j].charAt(k);
            }
            finalStr+= " ";
        }
        finalStr = finalStr.trim();

        return finalStr;

    }
}
