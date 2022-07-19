/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int each : nums){
            if(map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else {
                map.put(each, 1);
            }
        }
        for(int count : map.values()){
            if(count != 1){
                return true;
            }
        }
        return false;
    }
}
