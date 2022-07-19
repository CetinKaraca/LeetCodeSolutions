/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int pairCount = 0; //1
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] == nums[j])
                    count++;
                pairCount += count;
                count = 0;
                continue;
            }
        }
        return pairCount;
    }
}
