//Given an array nums of integers, return how many of them contain an even number of digits.

import java.util.ArrayList;
import java.util.List;

public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        List<String> newList = new ArrayList<>();
        for(int each : nums){
            newList.add(String.valueOf(each));
        }
        int count = 0;
        for(String each : newList){
            if(each.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
