package leetcode;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {

    public boolean hasPalindromePermutation(String input){
        Set<Character> unique = new HashSet<>();

        for (char c: input.toCharArray()) {
            if(unique.contains(c)) unique.remove(c);
            else unique.add(c);
        }
        return unique.size() <= 1;
    }
}
