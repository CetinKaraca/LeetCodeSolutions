/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */

public class Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {

        String[] newArr = s.split(" ");
        String[] secArr = new String[newArr.length];
        for(int j = 0; j < newArr.length; j++){
            String newStr = "";
            for(int i = newArr[j].length()-1; i >= 0; i--){
                newStr += "" + newArr[j].charAt(i);
            }
            secArr[j] = newStr;
        }

        String finalStr = "";
        for(int i = 0; i < secArr.length; i++){
            finalStr += secArr[i] + " ";
        }
        finalStr = finalStr.trim();
        return finalStr;
    }
}
