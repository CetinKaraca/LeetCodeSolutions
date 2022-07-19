/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
 */

public class Sum_of_Unique_Elements {
    public int sumOfUnique(int[] nums) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                sum += nums[i];
            }
        }
        return sum;
    }
}
