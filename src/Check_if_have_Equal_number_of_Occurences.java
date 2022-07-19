/*
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
 */

public class Check_if_have_Equal_number_of_Occurences {
    public boolean areOccurrencesEqual(String s) {

        int firstLetterCount = 0;
        for(int i = 0; i < 1; i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            firstLetterCount = count;
        }
        for(int k = 1; k < s.length(); k++){
            int count2 = 0;
            for(int y = 0; y < s.length(); y++){
                if(s.charAt(k) == s.charAt(y)){
                    count2++;
                }
            }
            if(count2 != firstLetterCount){
                return false;
            }
        }
        return true;
    }
}
