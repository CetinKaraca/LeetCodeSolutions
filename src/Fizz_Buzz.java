/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 */

import java.util.LinkedList;
import java.util.List;

public class Fizz_Buzz {
    public List<String> fizzBuzz(int n) {

        List<String> newArr = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                newArr.add("FizzBuzz");
            } else if(i % 5 == 0){
                newArr.add("Buzz");
            } else if(i % 3 == 0){
                newArr.add("Fizz");
            } else {
                newArr.add(""+i);
            }
        }
        return newArr;
    }
}
