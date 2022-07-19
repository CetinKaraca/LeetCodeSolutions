/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

public class Reverse_Integer {
    public int reverse(int x) {
        if(x < -2147483648  || x > 2147483647) return 0;
        String[] newStr = String.valueOf(x).split("");  // "-", "1", "2", "3"
        String s = "";
        for(int i = newStr.length - 1; i >= 0; i--){ //"3", "2", "1", "-"
            s+=newStr[i];
        }
        if(s.contains("-")){
            s = s.replace("-","");
        }
        long val = Long.parseLong(s);
        if(val < -2147483648  || val > 2147483647) return 0;
        int finalS = Integer.parseInt(s);
        if(x<0){
            finalS = finalS * -1;
        }
        return finalS;
    }
}
