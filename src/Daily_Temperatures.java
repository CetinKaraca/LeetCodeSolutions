/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] newArr = new int[temperatures.length];

        for(int k = 0; k < newArr.length; k++){
            newArr[k] = 0;
        }

        for(int i = 0; i < temperatures.length; i++){
            for(int j = i+1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    newArr[i] = j - i;
                    break;
                }
            }
        }
        return newArr;
    }
}
