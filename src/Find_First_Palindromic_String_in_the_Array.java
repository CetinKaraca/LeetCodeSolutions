/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
 */
public class Find_First_Palindromic_String_in_the_Array {
    public String firstPalindrome(String[] words) {
        String firstPalindrome = "";

        for(String each : words){
            String str = "";
            for(int j = each.length() - 1; j >= 0; j--){
                str += ""+each.charAt(j);
            }
            if(each.equals(str)){
                for(int i = 0; i < each.length(); i++){
                    firstPalindrome += ""+each.charAt(i);
                }
                break;
            }
        }
        return firstPalindrome;
    }
}
