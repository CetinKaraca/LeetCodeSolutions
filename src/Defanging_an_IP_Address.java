/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */

public class Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        String defanged = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                defanged += "[.]";
            }
            if(Character.isDigit(address.charAt(i))){
                defanged += address.charAt(i);
            }
        }
        return defanged;
    }
}
