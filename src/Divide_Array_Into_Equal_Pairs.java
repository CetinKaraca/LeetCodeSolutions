/*
You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
 */
public class Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        boolean pair = true;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                pair = false;
            }
        }
        return pair;
    }
}
