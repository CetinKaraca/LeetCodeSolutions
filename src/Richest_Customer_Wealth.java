/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */

import java.util.ArrayList;

public class Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            newList.add(wealth);
        }

        int richest = newList.get(0);
        for(int i = 0; i < newList.size(); i++){
            if(newList.get(i) > richest){
                richest = newList.get(i);
            }
        }

        return richest;

    }

}
