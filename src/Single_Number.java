/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class Single_Number {
    public int singleNumber(int[] nums) {
        int uniqueNum = 0;
        for(int i = 0; i < nums.length; i++){
            int freqCount = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    freqCount++;
                }
            }
            if(freqCount == 1){
                uniqueNum = nums[i];
            }
        }
        return uniqueNum;
    }
}
