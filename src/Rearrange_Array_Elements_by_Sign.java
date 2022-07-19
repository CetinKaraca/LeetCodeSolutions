/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */

import java.util.ArrayList;
import java.util.List;

public class Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){ //loop to separate positive and negative nums
            if(nums[i] >= 0){
                posList.add(nums[i]);
            } else negList.add(nums[i]); //adding nums to separate lists
        }

        int[] newArr = new int[nums.length];

        int posIndex = 0;
        for(int i = 0; i < newArr.length; i+=2){ //iterating by 2 thru newArr and placing pos nums
            newArr[i] = posList.get(posIndex);
            posIndex++;
        }

        int negIndex = 0;
        for(int i = 1; i < newArr.length; i+=2){ //iterating by 2 starting at index 1 in newArr and placing neg nums
            newArr[i] = negList.get(negIndex);
            negIndex++;
        }

        return newArr;
    }
}
