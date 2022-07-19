/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class Valid_Palindrome {
    public boolean isPalindrome(String s) {

        String newStr = "";
        String lowerS = s.toLowerCase();

        for(int i = 0; i < lowerS.length(); i++){
            if((lowerS.charAt(i) >= 'a' && lowerS.charAt(i) <= 'z') || (lowerS.charAt(i) >= '0' && lowerS.charAt(i) <= '9')){ //storing all the letters into newStr
                newStr+=lowerS.charAt(i);
            }
        }
        String reverse = "";
        for(int j = newStr.length() - 1; j >= 0; j--){
            reverse += newStr.charAt(j);
        }

        return reverse.equals(newStr) ? true : false;
    }
}
