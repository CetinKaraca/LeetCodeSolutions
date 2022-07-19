/*
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.
 */

import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs {
    public int maxProductDifference(int[] nums) {

        int biggest = 0;
        int secBig = 0;
        int smallest = 0;
        int secSmallest = 0;

        Arrays.sort(nums);

        biggest = nums[nums.length - 1];
        secBig = nums[nums.length - 2];
        smallest = nums[0];
        secSmallest = nums[1];

        return (biggest * secBig) - (smallest * secSmallest);

    }
}
