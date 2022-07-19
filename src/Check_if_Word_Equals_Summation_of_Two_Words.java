/*
The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
 */

import java.util.HashMap;
import java.util.Map;

public class Check_if_Word_Equals_Summation_of_Two_Words {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord){

        Map<String, Integer> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++){
            map.put(""+alphabet.charAt(i), i);
        }

        String targetSum = "";
        for(int j = 0; j < targetWord.length(); j++){
            targetSum += "" + map.get(""+targetWord.charAt(j));
        }

        String firstSum = "";
        for(int k = 0; k < firstWord.length(); k++){
            firstSum += "" + map.get(""+firstWord.charAt(k));
        }

        String secondSum = "";
        for(int x = 0; x < secondWord.length(); x++){
            secondSum += "" + map.get(""+secondWord.charAt(x));
        }

        int target = Integer.parseInt(targetSum);
        int firstNum = Integer.parseInt(firstSum);
        int secondNum = Integer.parseInt(secondSum);
        int total = firstNum + secondNum;

        return total == target;

    }
}
