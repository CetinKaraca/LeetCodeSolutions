/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {

        int[] newArr = new int[nums.length];
        int n = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                newArr[n++] = nums[i];
            }
        }

        for(int i = 0; i < newArr.length; i++){
            nums[i] = newArr[i];
        }
    }
}
