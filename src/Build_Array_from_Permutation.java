/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */

public class Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[nums[i]];
        }
        return newArr;
    }
}
