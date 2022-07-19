/*
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Goal_Parser_Interpretation {
    public String interpret(String command) {

        Map<String, String> map = new HashMap<>();

        map.put("G", "G");
        map.put("()", "o");
        map.put("(al)", "al");

        String interpret = "";

        ArrayList<String> newList = new ArrayList<>();

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) != ')'){
                newList.add("(al)");

            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                newList.add("()");

            } else if(command.charAt(i) == 'G'){
                newList.add("G");
            }
        }

        for(String each : newList){
            interpret += ""+map.get(each);
        }
        return interpret;
    }
}
