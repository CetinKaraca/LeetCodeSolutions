/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.
 */
public class Count_the_Number_of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {

        int consistentCount = 0;

        for(String each : words){
            int count = 0;
            for(int j = 0; j < each.length(); j++){
                if(allowed.contains(""+each.charAt(j))){
                    count++;
                }
            }
            if(count == each.length()){
                consistentCount++;
            }
        }
        return consistentCount;
    }
}
