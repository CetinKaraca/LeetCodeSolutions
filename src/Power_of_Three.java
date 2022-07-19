/*
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
 */

import java.util.ArrayList;

public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int result = 1;
        for(int i = 0; i < 20; i++){
            newArr.add(result);
            result *= 3;
        }
        for(int each : newArr){
            if(each == n){
                return true;
            }
        }
        return false;
    }
}
