/*
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 */

public class Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String each : operations){
            switch (each){
                case "--X":
                case "X--":
                    x = x - 1;
                    break;
                case "X++":
                case "++X":
                    x = x+1;
                    break;
            }
        }
        return x;
    }
}
