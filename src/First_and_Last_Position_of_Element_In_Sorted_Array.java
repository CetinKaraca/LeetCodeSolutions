/*
Given an array of integers nums sorted in non-decreasing order, find the
starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */

public class First_and_Last_Position_of_Element_In_Sorted_Array {

    public int[] searchRange(int[] nums, int target) {

        int[] indexArr = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                indexArr[0] = i;
                break;
            }
        }
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] == target){
                indexArr[1] = j;
                break;
            }
        }
        return indexArr;

    }
}
