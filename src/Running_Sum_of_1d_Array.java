/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        newArr[0] = nums[0];

        for(int i = 1; i < newArr.length; i++){
            for(int j = 0; j <= i; j++){
                newArr[i] += nums[j];
            }
        }
        return newArr;
    }
}
