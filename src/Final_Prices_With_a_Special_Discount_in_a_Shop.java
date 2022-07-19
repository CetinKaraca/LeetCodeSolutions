/*
Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop, if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise, you will not receive any discount at all.

Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.
 */

public class Final_Prices_With_a_Special_Discount_in_a_Shop {
    public int[] finalPrices(int[] prices) {

        int[] newArr = new int[prices.length];
        System.arraycopy(prices, 0, newArr, 0, prices.length);
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    newArr[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return newArr;
    }
}
