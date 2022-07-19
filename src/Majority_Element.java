/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

public class Majority_Element {
    public int majorityElement(int[] nums) {
        int majorNum = 0;
        for(int i = 0; i < nums.length; i++){
            int freqCount = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    freqCount++;
                }
            }
            if(freqCount > nums.length / 2){
                majorNum = nums[i];
            }
        }
        return majorNum;
    }
}
