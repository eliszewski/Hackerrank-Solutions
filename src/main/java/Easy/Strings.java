package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Strings {
    /*
    * Determine if String in a pangram
    * O(n) time complexity
    * */
    public static String pangrams(String s){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<String> stringSet = new HashSet<>(Arrays.asList(alpha.split("")));
        for (int i = 0; i < alpha.length(); i++) {
            if(!stringSet.contains(String.valueOf(alpha.charAt(i)))) return "not pangram";
        }
        return "pangram";
    }

}
