package Easy;

import java.util.HashSet;
import java.util.Set;

public class Strings {
    /*
    * Determine if String in a pangram
    * O(n + 26) time complexity
    * */
    public static String pangrams(String s){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha.indexOf(Character.toLowerCase(c)) >= 0) {
                stringSet.add(String.valueOf(c).toLowerCase());
            }
        }
        for (int i = 0; i < alpha.length(); i++) {
            if(!stringSet.contains(String.valueOf(alpha.charAt(i)))) return "not pangram";
        }
        return "pangram";
    }
    public static String hackerrankInString(String s){
        int j = 0,i ;
        for(i = 0; i <s.length(); i++){
            if(s.charAt(i) == "hackerrank".charAt(j)) j++;
            if(j == "hackerrank".length()) return "YES";
        }
        return "NO";
    }

}
