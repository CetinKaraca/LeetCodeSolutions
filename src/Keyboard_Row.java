/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Keyboard_Row {
    public String[] findWords(String[] words) {

        Map<String,Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        Map<String, Integer> thirdMap = new HashMap<>();

        String firstRow = "qwertyuiopQWERTYUIOP";
        for(int i = 0; i < firstRow.length(); i++){
            firstMap.put(""+firstRow.charAt(i), i);
        }

        String secRow = "asdfghjklASDFGHJKL";
        for(int i = 0; i < secRow.length(); i++){
            secondMap.put(""+secRow.charAt(i), i);
        }

        String thirdRow = "zxcvbnmZXCVBNM";
        for(int i = 0; i < thirdRow.length(); i++){
            thirdMap.put(""+thirdRow.charAt(i), i);
        }

        ArrayList<String> newList = new ArrayList<>();
        for(String each : words){
            int firstRowCount = 0;
            int secondRowCount = 0;
            int thirdRowCount = 0;
            for(int i = 0; i < each.length(); i++){
                if(firstMap.containsKey(""+each.charAt(i))){
                    firstRowCount++;
                } else if(secondMap.containsKey(""+each.charAt(i))){
                    secondRowCount++;
                } else if(thirdMap.containsKey(""+each.charAt(i))){
                    thirdRowCount++;
                }
            }
            if(firstRowCount == each.length()){
                newList.add(each);
            }else if(secondRowCount == each.length()){
                newList.add(each);
            }else if(thirdRowCount == each.length()){
                newList.add(each);
            }
        }
        String finalArr[] = newList.toArray(new String[newList.size()]);

        return finalArr;
    }
}
