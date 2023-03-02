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
    /*
    * O(n)
    *
    * */

    public static String hackerrankInString(String s){
        int j = 0,i ;
        for(i = 0; i <s.length(); i++){
            if(s.charAt(i) == "hackerrank".charAt(j)) j++;
            if(j == "hackerrank".length()) return "YES";
        }
        return "NO";
    }

    public static long repeatedString(String s, long n) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        long repetitions = n / s.length();
        long remainder = n % s.length();
        count *= repetitions;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void staircase(int n) {
    for (int i = 0; i < n; i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n - i - 1; j++) {
            sb.append(" ");
        }
        for (int u = 0; u < i + 1; u++) {
            sb.append("#");
        }
        System.out.println(sb.toString());
    }
}
//lower, upper, special, number, len of 6
public static int minimumNumber(int n, String password) {
    boolean upper = false;
    boolean lower = false;
    boolean special = false;
    boolean digit = false;
    int conditions = 0;
    for (int i = 0; i < n; i++) {
        char c = password.charAt(i);
        if(Character.isUpperCase(c)) upper = true;
        if(Character.isLowerCase(c)) lower = true;
        if(Character.isDigit(c)) digit = true;
        if(!Character.isDigit(c) && !Character.isAlphabetic(c)) special = true;
    }
    if(digit) conditions++;
    if(upper) conditions++;
    if(lower) conditions++;
    if(special) conditions++;
    if(6 - n < 4 - conditions) return 4 - conditions;
    return 6 - n;
}
}
