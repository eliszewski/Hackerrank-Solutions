package Easy;

import java.util.HashSet;
import java.util.Set;

public class Strings {
    /*
    * Determine if String in a pangram
    *
    * */
    public static String pangrams(String s){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<String> stringSet = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            stringSet.add(String.valueOf(s.charAt(i)).toLowerCase());
        }
        for (int i = 0; i < alpha.length(); i++) {
            if(!stringSet.contains(String.valueOf(alpha.charAt(i)))) return "not pangram";
        }
        return "pangram";
    }

}
